import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = formatter.format(dateTime);
        System.out.println(formattedDate);
        runTests();
    }
    public static void runTests() {
        testDateFormatting();
    }

        public static void testDateFormatting() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = formatter.format(dateTime);
        String expectedDate = "01 marzo 2023";

        if (formattedDate.equals(expectedDate)) {
            System.out.println("Test di formattazione della data superato.");
        } else {
            System.out.println("Test di formattazione della data fallito.");

        }

        }
    }
