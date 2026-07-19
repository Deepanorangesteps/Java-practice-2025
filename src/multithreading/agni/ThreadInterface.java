package multithreading.agni;

public class ThreadInterface implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Thread "+Thread.currentThread()+i);
        }
    }
}
