package week2;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {
        boolean moreCalculation = true;
        double price;
        double salesTax = 1.07;

        //This loop repeats as long as the user wants to do more calculations

        while (moreCalculation) {
            price = doubleInput("Type in a price");
            double priceInclTax = price * salesTax;
            System.out.println("The price plus sales tax is " + priceInclTax);

            // To decide if the loop should repeat, ask the user if they want to continue.
            // Notice that the moreCalculations variable is used in the while loop condition.
            moreCalculation = yesNoInput(" Do you want to continue?");
        }

        System.out.println("Thanks for using the program - goodbye!");
    }
}
