import java.util.stream.*;
public class Q1{
    public static void main(String... ss){
        System.out.println("Start...");
        
        Stream<String> stream = Stream.iterate("", (s) -> s + "1").limit(10).filter(w -> w.equals("4"));
        System.out.println(stream.limit(2).map(x -> x + "2"));

        
        System.out.println("End...");
    }
}
