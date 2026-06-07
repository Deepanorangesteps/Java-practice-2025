package concurrency;

public class Counter {
    int count =0;

    void increment(){
        count++;
    }
    synchronized  void increment2(){
        count++;
    }
}
