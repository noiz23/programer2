package Question15;

public class VisitPark{
    enum AnimalsInPark{
        SQUIRREL, CHIPMUNK, SPARROW;
    }
    
    public static void main(String... arg){
        AnimalsInPark[] animals = AnimalsInPark.values();
        System.out.println(animals[1]);
    }

}
