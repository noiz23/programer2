import java.util.stream.*;
import java.util.function.Predicate;
import java.util.*;
public class Q13{
    public static void main(String... ss){
        System.out.println("Start...");
        
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();
        Stream.of(l1, l2, l3)
            .flatMap(x -> x.stream())
            .map(x -> x + 1)
            .forEach(System.out::print);

        System.out.println("End...");
    }
}
