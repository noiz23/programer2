import java.util.*;
public class IsItFurry{
    static class Chipmunk{}
    public static void main(String... ee){
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r = new Thread();
        int result = 0;
        if (c instanceof Chipmunk) result += 1;
        if (l instanceof Chipmunk) result += 2;
        if (r instanceof Chipmunk) result += 4;
        
        System.out.println("result: " + result);
    }
}
