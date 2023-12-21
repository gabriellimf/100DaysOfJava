package Day2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Day2 {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current date and time is: " + now);
        String formattedNow = now.format(formatter);
        System.out.println("The current date and time is: " + formattedNow);
    }
}
