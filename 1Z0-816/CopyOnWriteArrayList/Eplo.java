import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Eplo{
    public static void main(String... ss){
        CopyOnWriteArrayList<Integer> numbers= new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
    try {
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                iterator.add(7);
            }
        }catch(UnsupportedOperationException e) {
         System.out.println("Method not supported: UnsupportedOperationException -> "+ e.getMessage());
      }
    }
}
