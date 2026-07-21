package multithreading.agni.callableandexecutor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // this return nothing means -> void
        CompletableFuture.runAsync(()->{
            System.out.println("Background Task");
        });

        // this will return
        CompletableFuture<String> future = CompletableFuture.supplyAsync(()->{
            return "Hello";
        });
        System.out.println(future.get());

        // chaining operation
        CompletableFuture<String> future1 = CompletableFuture
                .supplyAsync(()->"Java")
                .thenApply(str->str+" Developer");
        System.out.println(future1.get());

        CompletableFuture<Integer> future2 = CompletableFuture
                .supplyAsync(()->10)
                .thenApply(result->result*10);
        System.out.println(future2.get());

        // used for no return type
        CompletableFuture.supplyAsync(()->"Java")
                .thenAccept(System.out::println);
    }
}
