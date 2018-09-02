package thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            int times = i * 1000;
            Thread thread = new Thread("thread-" + (i + 1)) {
                @Override
                public void run() {
                    super.run();
                    try {
                        Thread.sleep(times);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                        System.out.println(Thread.currentThread().getName() + " finished");
                    }
                }
            };
            thread.start();
        }

        try {
            System.out.println("before await called");
            countDownLatch.await();
            System.out.println("after await called");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
