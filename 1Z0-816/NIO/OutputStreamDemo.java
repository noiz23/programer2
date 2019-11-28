import java.io.*;

public class OutputStreamDemo {
   public static void main(String[] args) {
      try {
         // create a new output stream
         OutputStream os = new FileOutputStream("test.txt");

         // craete a new input stream
         InputStream is = new FileInputStream("test.txt");

         // write something
         os.write('S');
         os.write('S');
         os.write('S');
         os.write('S');

         // flush the stream but it does nothing
         os.flush();

         // write something else
         os.write('B');
         
         
         os.flush();

         // read what we wrote
         System.out.println("" + is.available());
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}
