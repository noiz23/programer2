import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class Eplo{
    public static void main(String... ss){
        //CopyOnWriteArrayList<Integer> numbers= new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
        List<Integer> numbers = Arrays.asList(1, 3, 5, 8);
    try {
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                Integer r = iterator.next();
                System.out.println("val: " + r);
                if(r == 5)
                    iterator.remove();
            }
        
        }catch(UnsupportedOperationException e) {
         System.out.println("Method not supported: UnsupportedOperationException -> "+ e.getMessage());
       }catch(Exception e){
         System.out.println("Exception: " + e.getMessage());
    }
}
}
