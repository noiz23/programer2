import java.util.*;

public class NotasJavaExamples extends SuperClass{
    public static void main(String... args){
    
    List<? extends Number> lt = new ArrayList<Integer>();
    
    List<? super Integer> lt1 = new ArrayList<Number>();
    
        System.out.print("Val: " + new SuperClass().getVal());
    }
    
     public void method1(){
        System.out.println("NotasJavaExamples.method1");
    }
    
     public static void method2(){
        System.out.println("NotasJavaExamples.method2 - static");
    }

}

class SuperClass{

    private static int val=0;
    
    public int  getVal(){
        System.out.println("SuperClass.method1");
        return val;
    }
    
    public static void method2(){
        System.out.println("SuperClass.method2 - static");
    }
}
