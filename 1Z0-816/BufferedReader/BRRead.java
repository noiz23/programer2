import java.io.*;
public class BRRead{
    public static void main(String... ff) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter 'q' to exit.");
        
        //read characters
        do{
            c = (char) br.read();
            System.out.println(c);
        }while(c!='q');
    }
}
