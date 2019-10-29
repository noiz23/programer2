import java.io.*;
class DefaultMethodDemo{
    public static void main(String... dfd){
        MyIFImp obj = new MyIFImp();
        
        System.out.println("getNumber: " + obj.getNumber());
       /* 
        try{
            System.out.println("getString: " + obj.getString());
        }catch(Exception e){
            System.out.println("Error...");
        }
        */
        
        
    }
}

class MyIFImp implements MyIF{
    public int getNumber(){
        return 100;
    }
    
    public String getString() throws IOException{
        return "Override String.";
    }
}
