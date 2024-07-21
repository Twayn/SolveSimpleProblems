package task.leet75;

import java.util.ArrayDeque;
import java.util.Stack;

//Not fair
public class DecodeString {
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        final ArrayDeque<Integer> repeat = new ArrayDeque<>();
        final ArrayDeque<StringBuilder> toRepeat = new ArrayDeque<>();

        final char[] asChar = s.toCharArray();

        String currentMultiplier = "";

        for (int i = 0; i < asChar.length; i++) {
            final char c = asChar[i];

            if (Character.isDigit(c)) {
                currentMultiplier += c;
            } else if (c == '[') {
                repeat.push(Integer.parseInt(currentMultiplier));
                currentMultiplier = "";

                toRepeat.push(result);
                result = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = result;
                result = toRepeat.pop();
                result.append(temp.toString().repeat(repeat.pop()));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(new DecodeString().decodeString("zzz3[abc2[def]]xx"));
        System.out.println(new DecodeString().decodeString2("zzz3[abc2[def]]xx"));
    }

    public String decodeString2(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                st.push(n);
                n = 0;
                st1.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
