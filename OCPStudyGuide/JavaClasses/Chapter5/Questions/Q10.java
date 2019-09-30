import java.time.*;
import java.time.format.*;

public class Q10{

    public static void main(String... sss){
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));



        System.out.println("---->Date: g" );
    }

}
