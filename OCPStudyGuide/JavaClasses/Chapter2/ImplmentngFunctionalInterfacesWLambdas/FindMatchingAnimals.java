import java.util.function.*;
public class FindMatchingAnimals{
    private static void print(Animal animal,Predicate<Animal> trait){
        if(trait.test(animal)){
            System.out.println(animal);
        }
    
    }
    public static void main(String... ws){
        print(new Animal("fish", false,true),a -> a.canHop());
        print(new Animal("kangoroo", true,false),a -> a.canHop());
    }
}
