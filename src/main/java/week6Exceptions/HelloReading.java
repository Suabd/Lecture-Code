package week6Exceptions;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = null;
        try {
            FileReader reader = new FileReader("hello.txt");
            bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            //System.out.println(line.toUpperCase());

            bufferedReader.close(); // close file
        } catch (IOException e) {
            System.out.println("Sorry, error or file not found. " + e); // only rubs if IoException is thrown
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                }
                catch (IOException e) {
                    //
                    System.out.println("Error closing the file. " + e);
                }
            }

        }
    }
}
