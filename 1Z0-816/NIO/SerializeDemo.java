import java.io.*;
import java.util.*;
public class SerializeDemo {

   public static void main(String [] args) {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      
      try {
         /*FileOutputStream fileOut =
         new FileOutputStream("/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.println("Serialized data is saved in /tmp/employee.ser");
         
         // Serialize today's date to a file.
         int ii = 99;
            FileOutputStream f = new FileOutputStream("tmp");
            ObjectOutput s = new ObjectOutputStream(f);
            s.writeObject("Today");
            s.writeInt(ii);
            s.writeObject(new Date());
            s.flush();
         */   
        // Deserialize a string and date from a file.
            FileInputStream in = new FileInputStream("tmp");
            ObjectInputStream s = new ObjectInputStream(in);
            String today = (String)s.readObject();
            Date date = (Date)s.readObject();
            
      } catch (IOException i) {
         i.printStackTrace();
      }
   }
}
