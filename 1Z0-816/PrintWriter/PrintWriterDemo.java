import java.io.*;

public class PrintWriterDemo{
    public static void main(String... sss){
        PrintWriter pw = new PrintWriter(System.out, true);
        
        pw.println("Carajo!");
        pw.println(-5);
        pw.println(3.88);
    }

}
