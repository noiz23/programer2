package Question13;

import java.io.Console;

public class ConsoleClass{

    public static void main(String... ff){
        String line;
        Console c = System.console();
        if((line = c.readLine())!=null)
            System.out.println(line);
    }

}
