public class InterfaceTest {

    /**
     * Java中接口可以多继承
     */

    public interface interfaceA {
        void doSomething(int a);
    }

    public interface interfaceB {
        int doSomething();

    }

    public class interfaceC implements interfaceA, interfaceB {

        @Override
        public int doSomething() {
            return 0;
        }

        @Override
        public void doSomething(int a) {

        }
    }
}
