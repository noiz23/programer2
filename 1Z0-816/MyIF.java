import java.io.*;
public interface MyIF{
    int getNumber();
    
    default String getString() {//throws Exception{
        return getPrivateString();
    }
    
    private static String getPrivateString(){
        return "From private method";
    }
}
