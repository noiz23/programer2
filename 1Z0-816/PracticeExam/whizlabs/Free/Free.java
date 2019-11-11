import java.util.*;
public class Free{
    public static void main(String... sss){
        //new Free().Q2();
         new Free().Q5();
    
    }
    
    private void Q2(){
        List list = new ArrayList<Integer>();
        //list.add("Hello");
    }
    
    private void Q5(){
        //new C().m();
        B.m();
    }

}

interface A{
    default void m(){
        System.out.println("A");
    }
}

interface B{
    static void m(){
        System.out.println("B");
    }
}

class C implements A,B{}
