package thread;

public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread() {
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

        Thread threadB = new Thread() {
            @Override
            public void run() {
                super.run();
                threadA.start();
                try {
                    threadA.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("ThreadB print" + e);
                }
            }
        };

        threadB.start();
        threadB.interrupt();
//        threadA.start();
//        System.out.println("before thread.join()");
//        threadA.join();
//        System.out.println("after thread.join()");
//        System.out.println("wait until thread finished");

    }
}
