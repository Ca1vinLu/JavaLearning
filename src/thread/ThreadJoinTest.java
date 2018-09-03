package thread;

public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(3000);
                    System.out.println("thread finished");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        System.out.println("before thread.join()");
        thread.join();
        System.out.println("after thread.join()");
        System.out.println("wait until thread finished");

    }
}
