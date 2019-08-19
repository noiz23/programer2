import java.util.*;

public class Q15{

    public static void main(String... ddk){
        Comparator<Integer> c = (o1, o2) -> o2-o1;
        List<Integer> list = Arrays.asList(5, 4, 7, 1);
        System.out.println("1: " + list);
        Collections.sort(list, c);
        System.out.println("2: " + list);
    }

}
