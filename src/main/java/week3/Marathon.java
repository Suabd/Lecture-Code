package week3;

public class Marathon {
    public static void main(String[] args) {

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10; // used to increase by 10%

        int week = 1;
        // loop untill the current distance is greater than the target distance
        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease; // in
            week++; // count the number of weeks
        }

       // currentDistance = currentDistance * percentIncrease
        //week ++;
        // need to print one more line - the distance that is greater
        // than the marathon distance
        System.out.println(week + " " + currentDistance);


    }
}