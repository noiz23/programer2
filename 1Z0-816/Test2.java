import java.util.stream.*;
import java.util.*;
import static java.util.List.*;
public class Test2{
    public static void main(String... args){
        List<Integer> integers = List.of(0, 1, 2);
        integers.stream().peek(System.out::print).limit(2).forEach(i -> {});
    }

}
