public class ThreadLocalTest {
    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        System.out.println(TestClass.threadLocal.get());

        new Thread() {
            @Override
            public void run() {
                super.run();
                TestClass testClass = new TestClass();
                System.out.println(TestClass.threadLocal.get());
            }
        }.start();


    }

    static class TestClass {
        static ThreadLocal<Object> threadLocal = new ThreadLocal<>();

        public TestClass() {
            if (threadLocal.get() == null) {
                threadLocal.set(new Object());
                System.out.println("setThreadLocal");
            }
        }
    }
}
