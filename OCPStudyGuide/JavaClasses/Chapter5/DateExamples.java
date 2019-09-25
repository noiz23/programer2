import java.time.*;
public class DateExamples{
    public static void main(String... dd){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
   
         System.out.println("Zone time: " + ZoneId.systemDefault());
         
         ZoneId.getAvailableZoneIds()
         .stream()
         .filter(z -> z.contains("Santiago"))
         .sorted()
         .forEach(System.out::println);
         
         System.out.println("Period: " + (Period.of(1, 20, 47)));
         
         System.out.println("--> " + Period.ofWeeks(3));



    }

}
