import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class Calendar {
    public static void main(String[] args) {
        // Check if all arguments are provided
        if (args.length < 3) {
            System.out.println("Please provide date, month, and year as arguments.");
            return;
        }

        try {
            // Parse command-line arguments
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            // Create a LocalDate object
            LocalDate date = LocalDate.of(year, month, day);

            // Get the day of the week
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // Print the result
            System.out.println("The given date " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
                               + " falls on a " + dayOfWeek + ".");
        } catch (Exception e) {
            System.out.println("Invalid input. Please provide valid day, month, and year.");
        }
    }
}
