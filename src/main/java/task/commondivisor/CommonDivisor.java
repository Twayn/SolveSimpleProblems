package task.commondivisor;

public class CommonDivisor {
    public String gcdOfStrings(String str1, String str2) {
        String result = "";
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            final String candidate = str1.substring(0, i + 1);

            if (str1.length() % candidate.length() == 0 && str2.length() % candidate.length() == 0) {
                if (candidate.repeat(str1.length() / candidate.length()).equals(str1)
                    && candidate.repeat(str2.length() / candidate.length()).equals(str2)) {
                    result = candidate;
                }
            }

        }
        return result;
    }
}
