import java.time.*;
import java.time.temporal.*;
public class DateExamples{
    public static void main(String... dd){
        
        Instant now = Instant.now();
/*        
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

        Instant later = Instant.now();
        
        Duration duration = Duration.between(now, later);
        System.out.println("duration: " + duration.toMillis());

        System.out.println("Instance: " + now );

        Instant nextDay = now.plus(1, ChronoUnit.DAYS);
        System.out.println("nextDay " + nextDay); 
*/
    LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
    
    LocalTime time = LocalTime.of(1, 30);
    
    ZoneId zone = ZoneId.of("US/Eastern");
    
    ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
    
    System.out.println("A- :" + dateTime); // 2016–03–13T01:30–05:00[US/Eastern]
    
    dateTime = dateTime.plusHours(1);
    
    System.out.println("B- :" + dateTime); // 2016–03–13T03:30–04:00[US/Eastern]



    }

}
