import java.util.*;
import java.util.stream.*;

public class StreamEx{
    public static void main(String... sdsd){
    
    //var lst = List.of(1, 2, 3, 4);
    //List<Integer> lst = List.of(1,2,3,4);
    var lst = Arrays.asList(1, 2, 3, 4);

    //lst.replaceAll(x -> x + 100);
    //lst.stream().forEach(System.out::println);
    lst.stream().map(x -> x + 100).forEach(System.out::println);
    System.out.println("-Completed-");

    
    /*
        List<String> strList = List.of("A", "B", "C", "D", "E", "F", "G", "H");
        Spliterator<String> spli1=strList.spliterator();
        
        Spliterator<String> part1 = spli1.trySplit();
        part1.forEachRemaining(s -> System.out.print(s));
    
        System.out.println("--");
        
        spli1.forEachRemaining(s -> System.out.print(s));
    */
    }
}
