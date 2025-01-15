import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {

    public static void main(String[] args) {
        
        ZonedDateTime now = ZonedDateTime.now();

        ZonedDateTime gmtTime = now.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println("Current time in GMT: " + gmtTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

       
        ZonedDateTime istTime = now.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST: " + istTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

      
        ZonedDateTime pstTime = now.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pstTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
