package week6Exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVaribles {
    public static void main(String[] args) throws IOException {

        int classCode = 2454;
        double averageEnrollment = 22.16; // average number of students in a semester!
        String className = "Java";

        FileWriter writer = new FileWriter("Java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(classCode + "\n");
        bufferedWriter.write(averageEnrollment + "\n");
        bufferedWriter.write(className);

        //writer.close(); // close the file -- either way works
        bufferedWriter.close(); // close the file -- either way works

    }
}
