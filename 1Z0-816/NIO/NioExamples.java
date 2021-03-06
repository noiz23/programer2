import java.nio.file.*;

public class NioExamples{
    public static void main(String... args){
        
        Path path = Paths.get("/home/rdario/Documents/../..P2/NIO");
        /*
        String s = path.toString();
        System.out.println("- s: " + s);
        
        Path p = path.getFileName();
        System.out.println("- p: " + p);
        
        p = path.getName(3);
        System.out.println("- p: " + p);
        
        int i = path.getNameCount();
        System.out.println("- i: " + i);
        
        p = path.subpath(0,3);
        System.out.println("- p: " + p);
        
        p = path.getRoot();
        System.out.println("- p: " + p);
        
        
        Path p = path.resolveSibling("bar");
        System.out.println("- p: " + p);
        
        
        Path p = path.normalize();
        System.out.println("- p: " + p);
        */
        
        Path p1 = Paths.get("/etc");
        Path p2 = Paths.get("data/8");
        //Path p1_p2 = p1.relativize(p2);
        //System.out.println("relativize: " + p1_p2);
        
        Path p2_p1 = p1.resolve(p2);
        System.out.println("resolve: " + p2_p1);
        

    }

}
