package week6Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMonthsArray {
    public static void main(String[] args) throws Exception {
        String[] months = {"Jan", "Feb", "Mar"};

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("months.txt"));

        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            bufferedWriter.write(month + "\n");
            //bufferedWriter.newLine();
        }

        bufferedWriter.close();

    }
}
