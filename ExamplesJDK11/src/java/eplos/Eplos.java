package java.eplos;

import java.io.*;

public class Eplos {

	public static void main(String[] args) throws IOException {
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
