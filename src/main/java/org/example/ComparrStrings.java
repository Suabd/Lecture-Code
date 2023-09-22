package org.example;

import java.util.Objects;

import static input.InputUtils.stringInput;

public class ComparrStrings {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Yay, MCTC");
        } else {
            System.out.println("Too bad, you should check out MCTC");
        }
    }
}
