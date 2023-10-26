package week5HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTrip {
    public static void main(String[] args) {
        Map<String, Integer> distances = Map.of(
                "Duluth", 154,
                 "Stillwater", 26,
                 "Brainerd", 127,
                 "Ely", 245,
                 "Red Wing", 54);

        System.out.println(distances);

        int naxDrivingDistance = positiveIntInput("Enter the max distance you want to drive?");

        List<String> citiesInRange = new ArrayList<>();
        
        for (String city: distances.keySet())  {
            int distance = distances.get(city);
            if (distance <= naxDrivingDistance) {
                //System.out.println(city + " is " + distance + " miles away.");
                 citiesInRange.add(city);
            }
        }

        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, No cities are within your driving distance");
        } else {
            System.out.println("Here are the cities you can drive to, "+ citiesInRange.size() + " cities");
            for (String city: citiesInRange) {
                System.out.println(city);
            }
        }
    }
}
