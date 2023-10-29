package week6Exceptions;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        // The easiest way to convert the numbers to a String is to append the newline
        // character, the + operator will convert all the variables/values it joins to Strings
        bufferedWriter.write(data1 + "\n");

        // Or you can explicitly convert the number to a String with an Integer method
        bufferedWriter.write(Integer.toString(data2) + "\n");  // Still need the newline!

        // You can also write the newline with a separate method
        bufferedWriter.write(Integer.toString(data3));
        bufferedWriter.newLine();     //This adds the \n newline

        //Same approach works for doubles too

        double dblData1 = 234.56;
        double dblData2 = 999.99;

        // bufWriter.write(dblData1);  // This line gives an error, the argument must be a String or int (ints interpreted as character codes)

        bufferedWriter.write(dblData1 + "\n");   //Either append the newline...
        bufferedWriter.write(Double.toString(dblData2) + "\n");   //Or use Double.toString

        //Always close files when you are done working with them.
        bufferedWriter.close();
    }
}
