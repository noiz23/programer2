public class Client {

    private int value;
    
    public void setValue(int v){
        this.value = v;
    }
    
    public int getValue(){
        return value;
    }
    static void doCalc(byte... a) {
    System.out.print("byte...");
    }
       /* static void doCalc(long a, long b) {
        System.out.print("long, long");
        }
        */
   /* static void doCalc(Byte s1, Byte s2) {
    System.out.print("Byte, Byte");
    }*/
    public static void main (String[] args) {
    byte b = 5;
    doCalc(b, b);
    }
}
