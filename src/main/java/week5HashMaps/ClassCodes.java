package week5HashMaps;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {
        // What data type will the keys and values be?
        Map<Integer, String> classCodes = new HashMap<>();
        classCodes.put(2545, "Java");
        classCodes.put(1425, "Datacom");
        classCodes.put(2560, "Web");
        classCodes.put(2417, "Android");

        // Write a loop that prints all of the class codes and names
        // In the form "ITEC" 2545 Java"

        for (Integer classCode: classCodes.keySet()){
            String className = classCodes.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);
        }

        // Print the number of classes you are taking - size of the HashMap
        System.out.println("I am taking " + classCodes);
        int numberOfClasses = classCodes.size();

        // Ass this variable
        int searchCode = 2417; // Android programming

        // Write an if-statement to check if this code is in the HashMap
        // Print the class name if so? print a "Not Found" Message if not
        if (classCodes.containsKey(searchCode)) {
            System.out.println("This class is found in the HashMap. The class name is " +
                    classCodes.get(searchCode)) ;
        }

        // Add this variable.
        int searchCode2 = 2545 ;// That's us!
        String className = classCodes.get(searchCode2);
        if (className == null) {
            System.out.println(searchCode2 + " not found");
        } else {
            System.out.println("This class is found in the HashMap. THis class name is  " + className);
        }



    }
}
