public class MyIFImp implements MyIF{
    public static void main(String... dd){
        System.out.println("--> " + new MyIFImp().getString() );
    }
    
    public int getNumber(){
        return 33;
    }

}
