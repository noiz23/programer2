import java.util.stream.*;
import java.util.function.Predicate;
public class Q11{
    public static void main(String... ss){
        System.out.println("Start...");
        System.out.println(Stream.iterate(1, x -> ++x)
            .limit(5)
            .map(x -> "" + x)
            .collect(Collectors.joining()));

        System.out.println("End...");
    }
}
