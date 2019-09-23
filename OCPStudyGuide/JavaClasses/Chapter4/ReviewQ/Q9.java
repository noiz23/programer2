import java.util.stream.*;
import java.util.function.Predicate;
import java.util.*;
public class Q9{
    public static void main(String... ss){
        System.out.println("Start...");
    
        LongStream ls = LongStream.of(0 ,1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();

        //if (opt.isPresent()) System.out.println(opt.get());
        
        if (opt.isPresent()) System.out.println(opt.getAsLong());
        
        opt.ifPresent(System.out::println);



        System.out.println("End...");
    }
}
