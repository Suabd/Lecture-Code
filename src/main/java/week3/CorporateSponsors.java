package week3;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {

        // modify array make strings uppercase
        String[] sponsors = { "ikea", "at&t", "cvs", "3m"};

        for (int i = 0; i < sponsors.length; i++) {
            String sponsor = sponsors[i];
            sponsor = sponsor.toUpperCase();
            sponsors[i] = sponsor;
        }

        System.out.println(Arrays.toString(sponsors));
    }
}
