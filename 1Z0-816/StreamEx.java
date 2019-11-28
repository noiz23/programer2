import java.util.*;
import java.util.stream.*;

public class StreamEx{
    public static void main(String... sdsd){
  /*  
    //var lst = List.of(1, 2, 3, 4);
    //List<Integer> lst = List.of(1,2,3,4);
    var lst = Arrays.asList(1, 2, 3, 4);

    //lst.replaceAll(x -> x + 100);
    //lst.stream().forEach(System.out::println);
    lst.stream().map(x -> x + 100).forEach(System.out::println);
    System.out.println("-Completed-");

    
    
        List<String> strList = List.of("A", "B", "C", "D", "E", "F", "G", "H");
        Spliterator<String> spli1=strList.spliterator();
        
        Spliterator<String> part1 = spli1.trySplit();
        part1.forEachRemaining(s -> System.out.print(s));
    
        System.out.println("--");
        
        spli1.forEachRemaining(s -> System.out.print(s));
    */
    
    List<Client> clientList = new ArrayList<>();
    
    Client c = new Client();
    c.setValue(882);
    clientList.add(c);
    
    c = new Client();
    c.setValue(823);
    clientList.add(c);
    
    c = new Client();
    c.setValue(795);
    clientList.add(c);
    
    c = new Client();
    c.setValue(766);
    clientList.add(c);
    
    
    Optional<Client> average = Optional.empty(); //clientList.stream().mapToInt(i -> i.getValue()).average();
                                        
                            
                                        
                                        
    if(average.isPresent()){
            System.out.println("Promedio: " + average.get());
    }else
        System.out.println("-Promedio: 0");
    
    String date = "2019-11-14 13:56:49";
    System.out.println("dd: "+ date.substring(0,10));
    
    }
}
