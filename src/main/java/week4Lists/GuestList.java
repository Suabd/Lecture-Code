package week4Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Enter name of guest or enter to quit");

            if (name.isEmpty()) {
                break;
            }

            if (containsIgnoresCase(guestList, name)) {
                System.out.println("You already added " + name);
            } else {
                System.out.println("Adding " + name + " to list.");
                guestList.add(name);
            }
        }

        Collections.sort((guestList));
        //System.out.println(guestList);

        printGuestName(guestList);

        // Remove guest from list

        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here are all the guests");
            printGuestName(guestList);

            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove");
                break;
            }
            int index = positiveIntInput("Enter the number if the guests to remove");
            index--;
            if (index < guestList.size()) {
                String removeGuest = guestList.remove((index));
                System.out.println("Removed guest " + removeGuest);
            } else {
                System.out.println("Erro - please enter a valid number of guest");
            }
        }

        printGuestName(guestList);

        System.out.println("The number of guests in the guestList is " + guestList.size());

        selectPrizeWinner(guestList);
    }

    public static void selectPrizeWinner(List<String> guests) {

        if (guests.isEmpty()) {
            System.out.println("Warning - no guests - no-one to win the prize");
            return;
        }

        Random rnd = new Random();
        int randomGuestIndex = rnd.nextInt(guests.size()); // 0, 1, 3
        //int randomNumberBetween1and10 = rnd.nextInt(10) + 1;
        String prizeWinner = guests.get(randomGuestIndex);
        System.out.println("Guest number " + (randomGuestIndex+1) +  " "
                + prizeWinner + " wins a prize!");
    }

    public static void printGuestName(List<String> guests) {

        System.out.println(" Your guest list is: \n ");

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
        }

    }
        public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }

}
