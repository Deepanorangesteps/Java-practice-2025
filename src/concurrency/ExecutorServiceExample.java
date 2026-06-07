package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Instead of manually creating threads:
/*What It Does
ExecutorService:
Manages a pool of threads
Reuses threads
Controls number of threads
Makes concurrency easier
Think of it as a thread manager*/
public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2); //newFixedThreadPool(2) → creates 2 reusable threads
    executorService.execute(()->{
        System.out.println("Task 1 is running");
    });
    executorService.execute(()->{
        System.out.println("Task2 is running");
    });
    executorService.shutdown();/*newFixedThreadPool(2) → creates 2 reusable threads
Tasks are submitted
No manual thread creation*/
    }
}
