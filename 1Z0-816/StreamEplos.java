import java.util.stream.*;
import java.util.*;

public class StreamEplos{
    public static void main(String... sdfsd){
        // Creating a string stream 
        Stream<String> s = Stream.empty();//Stream.of("Geeks", "for","Geeks", "GeeksClasses"); 
  
        String firstStr = s.parallel().findFirst().orElseGet(() -> "data");
                            //.get(); 
                            
        System.out.println(firstStr); 
        
        /*
        // Using toCollection() method 
        // to create a collection 
        Collection<String> names = s 
                    .collect(Collectors 
                                .toCollection(TreeSet::new)); 
  
        // Printing the elements 
        System.out.println(names); 
        */
    
    }

}
