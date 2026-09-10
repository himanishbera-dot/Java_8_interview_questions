package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierExample {
    private static final int NUMBER_OF_WORKERS = 30;

    public static void main(String[] args) {
        // 1. Define the barrier action executed by the last thread entering the barrier
        Runnable barrierAction = () -> {
            System.out.println("\n[Barrier Action] All " + NUMBER_OF_WORKERS
                    + " workers arrived. Merging data chunks...\n");
        };

        // 2. Initialize CyclicBarrier for 3 threads with an optional barrier action
        CyclicBarrier barrier = new CyclicBarrier(NUMBER_OF_WORKERS, barrierAction);

        // 3. Create a thread pool to manage the workers
        ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_WORKERS);

        try {
            // Submit tasks to the executor
            for (int i = 1; i <= NUMBER_OF_WORKERS; i++) {
                String workerName = "Worker-" + i;
                executorService.submit(new DataProcessor(workerName, barrier));
            }
        } finally {
            // Gracefully shut down the executor service
            executorService.shutdown();
        }
    }

    // Task submitted to the worker threads
    static class DataProcessor implements Runnable {
        private final String name;
        private final CyclicBarrier barrier;

        public DataProcessor(String name, CyclicBarrier barrier) {
            this.name = name;
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                // Step 1: Independent task execution
                System.out.println(name + " processing step 1 data...");
                Thread.sleep((long) (Math.random() * 20000)); // Simulating work
                System.out.println(name + " finished step 1. Waiting at barrier.");

                // Step 2: Await other threads at the common barrier point
                barrier.await();

                // Step 3: Resume execution once the barrier is tripped
                System.out.println(name + " starting step 2 operations...");
                Thread.sleep((long) (Math.random() * 999999));
                System.out.println(name + " finished step 2.");

            } catch (InterruptedException e) {
                System.err.println(name + " was interrupted.");
                Thread.currentThread().interrupt();
            } catch (BrokenBarrierException e) {
                System.err.println("Barrier broken! " + name + " cannot proceed.");
            }
        }
    }
}

