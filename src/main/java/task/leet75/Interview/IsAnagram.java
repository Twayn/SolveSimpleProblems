package task.leet75.Interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = reader.readLine();
        String secondLine = reader.readLine();

        char[] sChars = firstLine.toCharArray();
        char[] tChars = secondLine.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        if (Arrays.equals(sChars, tChars)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}