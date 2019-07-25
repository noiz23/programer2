package Question11;

public class MagicClass{
    private static void magic(Stream<Integer> s){
        Optional o = s.filter(x -> x < 5).limit(3).max((x,y) -> x-y);
        System.out.println(o.get());
    
    }

}
