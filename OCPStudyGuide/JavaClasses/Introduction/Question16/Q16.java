package Question16;

import java.time.*;

public class Q16{
    public static void main(String... ss){
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();
        
        boolean b1 = d == p;
        boolean b2 = d.equals(p);
        
        System.out.println(b1 + " " + b2);
    }
}
