package week2;

import static input.InputUtils.stringInput;

public class Password {
    public static void main(String[] args) {
        String seretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password");

        int maxGusses = 5;
        //Before we let the user in, we need to check that the password is correct
        //This loop will repeat while the password is NOT "kittens", our secretPassword
        while ( ! userPassword.equals(seretPassword) && maxGusses > 1 ) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again");
            userPassword = stringInput("Enter the password");
            maxGusses--;
        }

        if (maxGusses > 1) {
            System.out.println("Correct password - access granted");
        }

        // TODO - top secret program here!

        else {
            System.out.println("Max number of password attempts");
            System.exit(0);
        }


    }
}
