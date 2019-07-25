package Question10;

public class AssertDemo{
    public static void main(String... ff){
        Integer x = 10;
        x++;
        assert x == null && x >=0;
        System.out.println("Value of x: ["+ x +"]");
    }
}
