public class NotasJavaExamples extends SuperClass{
    public static void main(String... args){
        
    }
    
     public void method1(){
        System.out.println("NotasJavaExamples.method1");
    }
    
     public static void method2(){
        System.out.println("NotasJavaExamples.method2 - static");
    }

}

class SuperClass{
    public void method1(){
        System.out.println("SuperClass.method1");
    }
    
    public static void method2(){
        System.out.println("SuperClass.method2 - static");
    }
}
