import java.util.stream.*;
public class CreateStreams{
    public static void main(String... sdfsdfs){
        Stream<String> empty = Stream.empty(); // count = 0
        System.out.println("Empty:"  + empty.count());
        
         Stream<Integer> singleElement = Stream.of(1);
         System.out.println("singleElement:"  + singleElement.count());
         
        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        System.out.println("fromArray:"  + fromArray.count());
 
    }
}
