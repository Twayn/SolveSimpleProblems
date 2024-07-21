package task.leet75.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WooHoo {
    public static void main(String[] args) throws Exception {
        List<String> allLines = Files.readAllLines(Paths.get("input.txt"));

        String J = allLines.get(0);
        String S = allLines.get(1);

        int result = 0;
        for (int i = 0; i < S.length(); ++i) {
            char ch = S.charAt(i);
            if (J.indexOf(ch) >= 0) {
                ++result;
            }
        }

        Files.writeString(Paths.get("output.txt"), String.valueOf(result));
    }

//    public static void main(String[] args) throws IOException {
//        Files.writeString(Paths.get("output.txt"), "abc");
//        Files.writeString(Paths.get("output.txt"), "cba", StandardOpenOption.APPEND);
//    }
}