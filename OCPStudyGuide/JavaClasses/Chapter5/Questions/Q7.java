import java.time.*;
import java.time.format.*;

public class Q7{

    public static void main(String... sss){
        LocalDate date = LocalDate.parse("2018–04–30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        //date.plusHours(3);

        System.out.println(date.getYear() + " "+ date.getMonth() + " "+ date.getDayOfMonth());


        System.out.println("---->Date: " + date);
    }

}
