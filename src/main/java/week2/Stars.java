package week2;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String[] args) {
        // Display a square of *
        int size = positiveIntInput("Enter size of square?");

        //The outer loop. for each row, print a star 5 times
        for (int x = 0; x < size; x++ ){

            //Inner for loop. for each row, print a star 5 times
            for ( int y = 0; y < size; y++){
                System.out.print("*");
            }

            //And then move to the next line
            System.out.println();
        }
    }
}
