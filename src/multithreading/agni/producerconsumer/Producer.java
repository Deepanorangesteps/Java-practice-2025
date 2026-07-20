package multithreading.agni.producerconsumer;

public class Producer implements Runnable {

	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {

		int value = 1;
		try {
			while (true) {
				buffer.produce(value);
				value++;
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			Thread.currentThread().interrupt();
		}
	}

}
