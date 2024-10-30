import java.util.ArrayList;

// Determine the average of all the integer numbers in a list
public class Task03 {

    public static void main(String[] args) {
        // Initialise the ArrayList
        ArrayList<Integer> nums = new ArrayList<>();

        // Add elements to ArrayList
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        // Initialise sum
        int sum = 0;

        // Loop through elements to calculate sum
        for (int num: nums) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / nums.size();

        // Print results
        System.out.println("The average of the numbers: " + average);
    }
}
