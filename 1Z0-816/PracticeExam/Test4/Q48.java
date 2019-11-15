import java.util.stream.*;
import java.util.*;

public class Q48{
    public static void main(String... args){
        Stream.of(0).findFirst().map(i -> i + 2).orElseThrow(ArithmeticException::new);
        
       // List<?> l = new ArrayList<>();
    }
}
