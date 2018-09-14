package thread;

public class WaitTest {
    private final Object o = new Object();

    public static void main(String[] args) {
        WaitTest waitTest = new WaitTest();
        waitTest.test();
    }

    public void test() {
        synchronized (o) {
            try {
                System.out.println("call before wait()");
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
