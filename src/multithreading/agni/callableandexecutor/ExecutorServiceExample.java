package multithreading.agni.callableandexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0;i<=10;i++){
            int task=i;
            executor.submit(()->{
                System.out.println(
                        "Task "+task+
                                " executed by "+
                                Thread.currentThread().getName()
                );            });

        }

        executor.shutdown();
    }
}
