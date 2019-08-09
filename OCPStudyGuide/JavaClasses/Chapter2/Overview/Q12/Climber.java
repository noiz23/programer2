public class Climber{
    public static void main(String... dd){
       // String stg = new Object();
       Object o = new String("");
        check((h,l) -> true,5);
    }
    
    private static void check(Climb climb, int height){
        if(climb.isTooHigh(height,10))
            System.out.println("too hight");
         else System.out.println("ok");
        
    }
}

interface Climb{
    boolean isTooHigh(int height,int limit);
}
