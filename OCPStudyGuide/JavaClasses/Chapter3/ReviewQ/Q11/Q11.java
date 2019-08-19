import java.util.*;

public class Q11{

    public static void main(String... ddk){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=10;i++){
            map.put(i,i*i);
        }
        System.out.println(map.get(4));
    }

}
