import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class Q24{
    public static void main(String... args){
        Stream<Integer> stream = Stream.of(4,3,5);
        Optional optional = Optional.of(stream.filter(i->i%2==0).reduce(Integer::sum));
        System.out.println(optional.get());
    }
}
