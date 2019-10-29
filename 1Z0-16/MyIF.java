import java.io.*;
public interface MyIF{
    int getNumber();
    
    default String getString() throws Exception{
        return "Dafult String";
    }
}
