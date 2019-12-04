import java.util.concurrent.*;
public class Q6{
    public static void main(String... args) throws Exception{
        ExecutorService service  = Executors.newFixedThreadPool(1);
        Runnable task = () -> {
            try{
                Thread.sleep(1000);
                System.out.println("Hello");
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        
        };
        Future<?> future = service.submit(task,"GoodBye");
        System.out.println(future.get());
        service.shutdownNow();
        
    }
}
