package task.leet75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateParenthesis {
    //i th character can be { only if there are less than N { chars before that position
    //i th character can be } only if count of { greater that } before that position

    public List<String> generateParenthesis(int n) {
        if (n == 1) {
            return List.of("()");
        }

        List<String> result = new ArrayList<>();

        generate(result, "", n, 0, 0);

        return result;
    }

    private void generate(List<String> result, String str, int n, int open, int close) {
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        if (open < n) {
            str += "(";
            generate(result, str, n, open + 1, close);
            str = str.substring(0, str.length() - 1);
        }

        if (open > close) {
            str += ")";
            generate(result, str, n, open, close + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(3));
    }
}
