import java.util.stream.*;
import java.util.*;

public class StreamEplos{
    public static void main(String... sdfsd){
        // Creating a string stream 
        //Stream<String> s = Stream.empty();//Stream.of("Geeks", "for","Geeks", "GeeksClasses"); 
        Product product = new Product();
    Optional<Product> op1 = Optional.of(product);
    Optional<Product> op2 = Optional.of(product);
  
    
     System.out.println(op1 == op2);
     
     System.out.println("op1.equals(op2) : " + op1.equals(op2));
        
    
    }

}

class Product{
    
    public String getName(){
        return "name";
    }

}
