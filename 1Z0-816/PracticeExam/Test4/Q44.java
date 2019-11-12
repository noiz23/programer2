import java.util.*;
import java.util.concurrent.*;
public class Q44 {
    public static void main(String... args){
        var l = new CopyOnWriteArrayList<>(List.of("a","b"));
        Iterator<String> iterator = l.iterator();
        
        l.clear();
        while(iterator.hasNext()){
            l.remove(iterator.next());
            System.out.println(iterator.next());
        }
    }
    
}
