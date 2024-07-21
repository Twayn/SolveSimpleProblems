package task.leet75.Interview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class RemoveDuplicates {
    public static void main(String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter("output.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String numberOfLines = reader.readLine();

        String previousLine = reader.readLine();
        printWriter.println(previousLine);

        for (int i = 0; i < Integer.parseInt(numberOfLines) - 1; i++) {
            final String nextLine = reader.readLine();
            if (nextLine.equals(previousLine)) continue;

            printWriter.println(nextLine);
            previousLine = nextLine;
        }

        reader.close();
        fileWriter.close();
    }
}