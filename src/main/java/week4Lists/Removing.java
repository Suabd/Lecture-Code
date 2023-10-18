package week4Lists;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        //classNames.remove("Project Management"); // object - removes by value
        boolean wasRemoved = classNames.remove("Project Management");//object
        System.out.println(classNames + " " + wasRemoved);

        classNames.remove(0); // int primitive type - index are primitive int type
        System.out.println(classNames);

        classNames.set(0, "Systems Analysis");
        System.out.println(classNames);

        String search = "C# Programming";
        if (classNames.contains(search)) {
            System.out.println("The list does contain C# " + search);
        } else {
            System.out.println("The list does NOT contain " + search);
        }

        System.out.println(classNames.size());

        classNames.clear();

        System.out.println(classNames);
        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());


    }
}
