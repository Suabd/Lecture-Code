package week4Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {

        List<String> todolist = new ArrayList<>();
        while (true) {
            String data = stringInput("Type a task you need to do, or Enter to quit");
            if (data.isEmpty()) {
                break;
            }
            if (containsIgnoresCase(todolist, data)) {
                System.out.println("You already added that!");
            } else{
                todolist.add(data);
            }
        }

        System.out.println("Thank you, your tasks are:");

        for (String input: todolist) {
            System.out.println(input);
        }

        System.out.println("You have " + todolist.size() + " task to do");
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
