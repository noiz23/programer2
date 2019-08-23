import java.util.stream.*;
import java.util.function.*;
public class ReduceExamples{
    public static void main(String... ddfdf){
    /*
        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String s: array) result = result + s;
        System.out.println(result);
    
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    String word = stream.reduce("", (s, f) -> s + f);
    System.out.println("stream: " + word);
 
    Stream<String> stream = Stream.of("w", "o", "l", "f");
    String word = stream.reduce("", String::concat);
    System.out.println(word);
    
    */
    BinaryOperator<Integer> op = (a, b) -> a * b;
    Stream<Integer> stream = Stream.of(3, 5, 6);
    System.out.println(stream.reduce(1, op, op)); // 90



    }
}
