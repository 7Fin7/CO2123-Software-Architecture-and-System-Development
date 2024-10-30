import java.util.ArrayList;

// Check whether all the words in the list contain the letter 'n'
public class Task05 {

    public static void main(String[] args) {
        // Initialise ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to ArrayList
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("coconut");
        fruits.add("apple");

        // Loop through elements in fruits
        for (String fruit: fruits) {
            // Check if fruit contains letter 'n' and if so output found
            if (fruit.contains("n")) {
                System.out.println("Found");
                // If fruit doesn't contain letter 'n' output not found
            } else {
                System.out.println("Fruit " + fruit + " does not contain the letter n");
            }
        }
    }
}
