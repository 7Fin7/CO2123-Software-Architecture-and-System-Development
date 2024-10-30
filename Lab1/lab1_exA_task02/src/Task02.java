import java.util.ArrayList;

public class Task02 {

    public static void main(String[] args) {
        // Initialise the ArrayList
        ArrayList<String> fruit = new ArrayList<>();

        // Add elements to fruit
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("coconut");

        for (int i = 0; i < fruit.size(); i++) {
            System.out.println(fruit.get(i));
        }

    }
}
