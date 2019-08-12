import java.util.*;

public class Um{
 public static void printList(List<?> list){
    for(Object x: list) System.out.println(x);
}
 
 public static void main(String... asda){
    List<String> keywords = new ArrayList<>();
    keywords.add("java");
    keywords.add("carajo");
    
    printList(keywords);
 }

}

