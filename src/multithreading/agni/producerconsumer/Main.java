package multithreading.agni.producerconsumer;

public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread producerThread = new Thread(new Producer(buffer));
		Thread consuemrThread = new Thread(new Consumer(buffer));
		producerThread.start();
		consuemrThread.start();

	}

}
