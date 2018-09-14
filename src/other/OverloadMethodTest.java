package other;

public class OverloadMethodTest {
    public static void main(String[] args) {
        OverloadMethodTest test = new OverloadMethodTest();
        test.method(null);
    }

    class A {
    }

    class B extends A {
    }

    public void method(A a) {
        System.out.println("Object");
    }

    public void method(B b) {
        System.out.println("String");
    }
}
