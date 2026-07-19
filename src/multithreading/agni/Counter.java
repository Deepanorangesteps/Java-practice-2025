package multithreading.agni;

public class Counter {
    Object lock = new Object();
    int count =0;
    public static int counter= 0;

    public Counter(){
        synchronized (this){

        }
    }
    void increment (){
        count++;
    }

    public void increment4(){
        // synchronized block we block using the object level
        synchronized (this){
            count++;
        }
    }
    static synchronized void increment3(){

        counter++;
    }

    synchronized  void increment2(){
        count++;
    }
}
