import java.io.*;

public class BRReadLine{
    public static void main(String... ddd) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter 'stop' to exit.");
        
        String str;
        
        do{
            str = br.readLine();
            System.out.println("Inserted: " + str);
        }while(!str.equals("stop"));
    
    }

}
