interface A {
    default void m() {
        System.out.println("A");
    }
}

abstract class B {
    abstract void m();
}

class C extends B {//implements A {
   void m() {
        System.out.println("C");
    }
}

public class Test {
    public static void main(String[] args) {
        new C().m();
    }
}
