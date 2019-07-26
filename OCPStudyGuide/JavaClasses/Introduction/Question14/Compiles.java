package Question14;

public class Compiles{
    class RainException extends Exception{}
    
    public static void main(String... ss){
        try(Scanner s = new Scanner("rain");String line;){
            if(s.nexLine().equals("rain"))
                throw new RainException();
        }finally{
            s.cose();
        }
    }
    
    
}
