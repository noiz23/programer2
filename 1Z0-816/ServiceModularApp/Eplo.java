import java.util.stream.*;

public class Eplo{

    public static void main(String... args){
        //System.out.println(isPrime(Integer.valueOf(args[0])));
        System.out.println("sumOfFirstNPrimes: " + sumOfFirstNPrimes(Integer.valueOf(args[0])));
    }
    
    public static Boolean isPrime(Integer number){
        if ( number == 1 ) { return false; }
        
        //IntStream.range(2,number).forEach(System.out::println);
        return IntStream.range(2,number).noneMatch(i -> number % i == 0 );
    }
    
    public static Integer sumOfFirstNPrimes(Integer count){
        return IntStream.iterate(1,i -> i+1)
                        .filter(j -> isPrime(j))
                        .limit(count).sum();
    }
}
