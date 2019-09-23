import java.util.stream.*;
import java.util.function.Predicate;
public class Q3{
    public static void main(String... ss){
        System.out.println("Start...");
        
        Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
        Stream<String> stream1 = Stream.iterate("-", (s) -> s + s);
        boolean b1 = stream.noneMatch(predicate);
        boolean b2 = stream1.anyMatch(predicate);
        System.out.println(b1 + " " + b2);

        System.out.println("End...");
    }
}
