package week6Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException {

        // file will be created if it does not exist!
        //file will be overwritten if it does exist!
        //FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"));

        bufferedWriter.write("Hello!\n");
        bufferedWriter.write("More data here\n");
        bufferedWriter.write("Goodbye!\n");

        bufferedWriter.close(); // don't forget to close the file!

        FileWriter writer2 = new FileWriter("hello.txt", true); // append flag - true means add data to the end
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data!\n");
        bufferedWriter2.write("Hello programmers!\n");
        bufferedWriter2.write("End of file!\n");

        bufferedWriter2.close(); // don't forget to close the file!


    }
}
