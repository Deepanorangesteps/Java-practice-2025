package multithreading.agni.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class  Buffer {

	private Queue<Integer> queue = new LinkedList<>();
	private int size = 5;

	public synchronized void produce(int data) throws InterruptedException {
		while (queue.size() == size) {
			System.out.println("Queue is full Producer is waiting... ");
			wait();

		}
		queue.add(data);
		System.out.println("Producer produced this value " + data);
		notify();
	}

	public synchronized int consume() throws InterruptedException {
		if (queue.isEmpty()) {
			System.out.println("Queue is Empty. Consumer is waiting...");
			wait();
		}
		int value = queue.poll();
		System.out.println("Consumer consumed the value: " + value);
		notify();
		return value;

	}

}
