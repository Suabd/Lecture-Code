package week4Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello"); // Add
        arrayList.add("World");
        arrayList.add("Suban");
        arrayList.add("MCTC");

        String firstWord = arrayList.get(0);

        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

        System.out.println(arrayList);

        for (String name: arrayList){
            System.out.println(name);
        }
        System.out.println();

        for (int i = 0 ; i <arrayList.size() ; i++){
            // index - if need to know index as well as data
            System.out.println(arrayList.get(i));
            arrayList.remove(0);
        }
        while (!arrayList.isEmpty()) {
            String name = arrayList.remove((0));
            System.out.println(name);
        }
    }
}
