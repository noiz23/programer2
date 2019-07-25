package Question11;

import java.util.stream.*;
import java.util.Optional;
public class MagicClassOK{
    private static void magic(Stream<Integer> s){
        Optional o = s.filter(x -> x < 5).limit(3).max((x,y) -> x-y);
        System.out.println(o.get());
    
    }

}
