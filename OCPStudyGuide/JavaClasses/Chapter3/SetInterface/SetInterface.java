import java.util.*;
public class SetInterface{
    public static void main(String... jjj){    
        Set<Integer>  set = new TreeSet<>();
        boolean b1 = set.add(66);
        boolean b2 = set.add(10);
        boolean b3 = set.add(66);
        boolean b4 = set.add(8);
        
        for(Integer integer:set)
            System.out.print(integer + ",");
        }
}
