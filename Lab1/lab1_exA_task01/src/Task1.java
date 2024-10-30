import java.text.SimpleDateFormat;
import java.util.Date;

// A simple program that displays the current date in "dd/MM/yyyy" format.
public class Task1 {

    public static void main(String[] args) {
        // Create String dateString and set to null
        String dateString = null;

        // Create SimpleDateFormat object
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Use the sdf object to format the current date
        try {
            Date currentDate = new Date();  // Create Date object with current date
            dateString = sdf.format(currentDate);   // Format current date to 'dd/MM/yyy'
        } catch (Exception e) {
            System.out.println("An error occurred while formatting the date");
        }

        System.out.println("Finley: " + dateString);
    }
}
