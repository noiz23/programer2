import java.util.*;

public class AppleClass{
    
    public static void main(String... dsf){
        Apple ap;
        ap = Apple.RedDe1;
        
        if(ap == Apple.RedDe1) {
            System.out.println("-- .values() :" +  Arrays.asList(ap.values()));
            System.out.println("-- .valuesOf(--):" +  ap.valueOf("Data1"));
            
        }else
            System.out.println("Gonorrea!" );
    }
    
    
}
