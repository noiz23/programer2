import java.time.*;

public class DateExamples{
    public static void main(String... args){
    
        System.out.println("LocalDate:");
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate.toString() : " + localDate.toString());                //2013-05-15
        System.out.println("localDate.getDayOfWeek().toString() :" + localDate.getDayOfWeek().toString()); //WEDNESDAY
        System.out.println("localDate.getDayOfMonth() :" + localDate.getDayOfMonth());           //15
        System.out.println("localDate.getDayOfYear() :" + localDate.getDayOfYear());            //135
        System.out.println("localDate.isLeapYear() :" + localDate.isLeapYear());              //false
        System.out.println("localDate.plusDays(12).toString() :" + localDate.plusDays(12).toString());   //2013-05-27
        
        System.out.println("---------------------------------------------");
        
        System.out.println("LocalTime:");
        LocalTime localTime = LocalTime.now();
        
        System.out.println(localTime.toString());    //12:20
        System.out.println(localTime.getHour());     //12
        System.out.println(localTime.getMinute());   //20
        System.out.println(localTime.getSecond());   //0
        System.out.println(localTime.MIDNIGHT);      //00:00
        System.out.println(localTime.NOON);  
        
        System.out.println("---------------------------------------------");
        
        System.out.println("LocalDateTime:");
        
        LocalDateTime localDateTime = LocalDateTime.now(); 
        System.out.println(localDateTime.toString());      //2013-05-15T10:01:14.911
        System.out.println(localDateTime.getDayOfMonth()); //15
        System.out.println(localDateTime.getHour());       //10
        System.out.println(localDateTime.getNano());
    
    }

}
