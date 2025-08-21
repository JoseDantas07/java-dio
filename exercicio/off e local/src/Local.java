import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Local {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Date date = new Date();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");

        System.out.println(localDate);
        System.out.println(dateTimeFormatter.format(localTime));
        System.out.println(dateTimeFormatter1.format(dateTime));
        System.out.println(date);
    }
}
