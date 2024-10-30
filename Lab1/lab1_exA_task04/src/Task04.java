import java.util.ArrayList;

// Check whether list contains value
public class Task04 {

    public static void main(String[] args) {
        // Initialise ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to ArrayList
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("coconut");
        fruits.add("apple");

        // Check if 'banana' is in ArrayList
        if (fruits.contains("banana")) {
            System.out.print("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
