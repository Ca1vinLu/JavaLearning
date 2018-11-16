package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    static int value = 0;

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 200; i++) {
            new Thread() {
                @Override
                public void run() {
                    super.run();
                    lock.lock();
                    System.out.println(++value);
                    lock.unlock();
                }
            }.start();
        }
    }
}
