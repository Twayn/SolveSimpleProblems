package task.stringcompressor;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringCompressor {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        char c = chars[0];
        int sameSymbolsCount = 1;
        int resultPosition = 0;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == c) {
                sameSymbolsCount++;
            } else {
                chars[resultPosition++] = c;

                if (sameSymbolsCount > 1) {
                    final char[] charArray = Integer.toString(sameSymbolsCount).toCharArray();
                    System.arraycopy(charArray, 0, chars, resultPosition, charArray.length);
                    resultPosition += charArray.length;
                }

                c = chars[i];
                sameSymbolsCount = 1;
            }
        }

        chars[resultPosition++] = c;

        if (sameSymbolsCount > 1) {
            final char[] charArray = Integer.toString(sameSymbolsCount).toCharArray();
            System.arraycopy(charArray, 0, chars, resultPosition, charArray.length);
            resultPosition += charArray.length;
        }


        return resultPosition;
    }

    public static void main(String[] args) {
//        final char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
//        System.out.println(new StringCompressor().compress(chars));
//        System.out.println(chars);

        final char[] chars2 = {'a', 'b', 'c'};
        System.out.println(new StringCompressor().compress(chars2));
        System.out.println(chars2);
    }
}
