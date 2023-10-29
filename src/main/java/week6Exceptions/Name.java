package week6Exceptions;

import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {

        String filename = "data.txt";
        String name = "Suban";
        String favoriteColor = "blue";
        int classCode = 2454;

        // write to the file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favoriteColor);
        bufferedWriter.newLine();
        bufferedWriter.write(classCode + "\n");

        bufferedWriter.close(); // end

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
