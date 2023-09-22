package week2;

public class January {
    public static void main(String[] args) {
        for (int day = 1; day <= 31; day++){
            if (day == 1 || day == 21 || day == 31) {
                System.out.println("January " + day + "st");
            }

            // else if --- for 2nd
            // else if --- for 3rd

            else {
                System.out.println("January " + day + "th");
            }
        }
    }
}
