import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentLocalDateTime {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2026, 8, 7);
        LocalTime currentTime = LocalTime.of(12, 4, 13);
        LocalDateTime currentDateTime = LocalDateTime.of(currentDate, currentTime);

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);
    }
}
