package item17.concurrent;

import java.util.concurrent.CountDownLatch;

public class ConcurrentExample {
    public static void main(String[] args) throws InterruptedException {
        int N = 10;
        CountDownLatch startSignal = new CountDownLatch(1);
        CountDownLatch doneSignal = new CountDownLatch(N);

        for (int i = 0; i < N; i++) { // create and start threads
            new Thread(new Worker(startSignal, doneSignal)).start();
        }

        ready();
        startSignal.countDown(); // let all threads proceed
        doneSignal.await();      // wait for all to finish
        done();
    }

    private static void ready() {
        System.out.println("준비!");
    }

    private static void done() {
        System.out.println("끝!");
    }

    private static class Worker implements Runnable {
        private final CountDownLatch startSignal;
        private final CountDownLatch doneSignal;

        public Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
            this.startSignal = startSignal;
            this.doneSignal = doneSignal;
        }

        @Override
        public void run() {
            try {
                startSignal.await();
                doWork();
                doneSignal.countDown();
            } catch (InterruptedException ex) {}
        }

        void doWork() {
            System.out.println("working thread: " + Thread.currentThread().getName());
        }
    }
}