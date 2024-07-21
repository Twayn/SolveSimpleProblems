package task.leet75.Interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LongestOneSequence {
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("output.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String numberOfLines = reader.readLine();

        int maxOnesSequence = 0;
        boolean sequenceInProgress = false;
        int currentOnesSequence = 0;

        for (int i = 0; i < Integer.parseInt(numberOfLines); i++) {
            if (Integer.parseInt(reader.readLine()) == 1) {
                sequenceInProgress = true;
                currentOnesSequence++;
            } else {
                if (sequenceInProgress) {
                    sequenceInProgress = false;
                    maxOnesSequence = Math.max(currentOnesSequence, maxOnesSequence);
                    currentOnesSequence = 0;
                }
            }
        }

        if (sequenceInProgress) {
            maxOnesSequence = Math.max(currentOnesSequence, maxOnesSequence);
        }

        printWriter.println(maxOnesSequence);

        reader.close();
        fileWriter.close();
    }
}
