import java.util.stream.*;

public class Q48{
    public static void main(String... args){
        Stream.of(0).findFirst().map(i -> null).orElseThrow(ArithmeticException::new);
    }
    
}
