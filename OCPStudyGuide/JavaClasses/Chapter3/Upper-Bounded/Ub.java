import java.util.*;

public class Ub{
     static class Sparrow extends Bird{}
     static class Bird{}
    
    public static void main(String... ggg){
        //List<? extends Bird> birds = new ArrayList<Sparrow>();
        //birds.add(new Sparrow());
        
        List<? extends Number> list = new ArrayList<Integer>();
        Integer a = 0;
        list.add(a);
    }
}
