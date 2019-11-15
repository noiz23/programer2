import java.util.stream.*;
import java.util.*;

public class ForEachOrdered{
    public static void main(String... args){
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        
        System.out.println("---> forEach: ");
        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEach( System.out::println );        //1
 
        System.out.println("---> forEachOrdered: ");
        list.stream()
            .sorted(Comparator.reverseOrder())
            .forEachOrdered( System.out::println ); //2
    
    }

}
