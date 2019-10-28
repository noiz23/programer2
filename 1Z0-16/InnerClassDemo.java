public class InnerClassDemo{
    public static void main(String... dd){
        Outer outer = new Outer();
        outer.test();
        
        
        System.out.println("-->");
        
    }

}

class Outer{
    int  outer_x=100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    
    void showy(){
        System.out.println("--> y: "+ y);
    }
    
    class Inner{
        int y = 10;
        void display(){
            System.out.println("--> outer_x: "+ outer_x);
        }
    }
}
