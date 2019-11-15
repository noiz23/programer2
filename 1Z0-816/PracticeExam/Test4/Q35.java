public class Q35{
   static String s1;
    public static void main(String... args){
       class Foo{
           final static String s2 = "java";
            
            void m(){
                System.out.println(s1+s2);
            }
        }
        
       // new Foo().m();
    }
    
  /*  static void m(){
                System.out.println(s1);
            }
   */         
}
