package Question1;

import java.util.concurrent.*;
import java.util.stream.*;

public class BabyPandaBathManager{
    public static void await(CyclicBarrier cb){
    System.out.println("        Start Question1 BabyPandaBathManager.await method...");
        try{
            cb.await();
        }catch(InterruptedException | BrokenBarrierException e){
            System.out.println("Error: " + e);
        }
    System.out.println("        End Question1 BabyPandaBathManager.await  method...");
    }

    public static void main(String ... qwq){
        System.out.println("        Start Question1 BabyPandaBathManager class...");
        final CyclicBarrier cb = new CyclicBarrier(3,()-> System.out.println("Clean!")); //u1
        ExecutorService service = Executors.newScheduledThreadPool(2);
        IntStream.iterate(1,i -> 1) //u2
            .limit(12)
            .forEach(i-> service.submit(//u3
            ()-> await(cb)));//u4
        service.shutdown();
        System.out.println("        End Question1 BabyPandaBathManager class...");
    }
}
