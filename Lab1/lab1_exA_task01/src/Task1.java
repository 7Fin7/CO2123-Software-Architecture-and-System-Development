import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1 {

    public static void main(String[] args) {
        // create String dateString and set to null
        String dateString = null;

        // create SimpleDateFormat object
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // use the sdf object to format the current date
        try {
            Date currentDate = new Date();  // create Date object with current date
            dateString = sdf.format(currentDate);   // format current date to 'dd/MM/yyy'
        } catch (Exception e) {
            System.out.println("An error occurred while formatting the date");
        }

        System.out.println("Finley: " + dateString);
    }
}
