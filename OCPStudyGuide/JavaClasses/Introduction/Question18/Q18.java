package Question18;

import java.util.*;

public class Q18{
    public static void main(String... ss){
        //Set<? extends RuntimeException> set = new HashSet<? extends RuntimeException>();
        //Set<? extends RuntimeException> set = new HashSet<Exception>();
        Set<? extends RuntimeException> set = new TreeSet<RuntimeException>();
        Set<? extends RuntimeException> set1 = new TreeSet<NullPointerException>();
    }
}
