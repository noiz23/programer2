import java.util.*;

public class GenericsEplos{
    public static void main(String... args){
        List<?> l = new ArrayList<>();
        l.add(null);
        //l.add("d");
        //l.add(10);
        
        List<Object> list = new ArrayList<>();
        list.add(null);
        list.add("d");
        list.add(10);
        
        System.out.println("-> " + l );
        System.out.println("-> " + list );
    }

}
