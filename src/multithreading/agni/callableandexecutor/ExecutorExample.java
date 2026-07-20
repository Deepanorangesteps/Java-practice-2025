package multithreading.agni.callableandexecutor;

import java.util.concurrent.*;

public class ExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();
        Callable<Integer> task  =()->{
          return 5;
        };
        Future<Integer> future = executor.submit(task);
        Integer result = future.get();
        System.out.println(result);

        Future<Integer> future1 =executor.submit(()-> 2+3);
        System.out.println(future1.get());

        Runnable runnableTask = ()->{
            System.out.println("hello world");
        };
        Future<?> future2 = executor.submit(runnableTask);
        try {
            future2.get();
        }catch (InterruptedException e){
            System.out.println("Interrupted "+e.getMessage());
        }

        executor.shutdown();
    }
}
