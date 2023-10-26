package week5HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class States {
    public static void main(String[] args) {

        Map<String, String> stateAbbreviations = new TreeMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));
        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreviations = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviations);

        // Loop over HashMap Keys

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        // loop over HashMap values
        for (String abbreviation: stateAbbreviations.values()) {
            System.out.println(abbreviation);
        }

        // How about looking up abbreviations for states?
        // one way - loop over key-value pairs until value is found

        String searchAbbreviation = "MI";

        // Loop over set of key value pairs called entries
        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        // Another way - create a new Hashmap - each key becomes a value, each value becomes
        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()){
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);
        }

        System.out.println(stateAbbreviations);
        System.out.println(abbreviationsStateNames);

        System.out.println("There are " + stateAbbreviations.size() + " states listed");

    }
}
