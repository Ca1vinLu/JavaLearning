public class InterfaceTest {

    /**
     * Java中接口可以多继承，但方法签名必须不同（方法名和参数列表不能完全一致，返回类型不同不算）
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
