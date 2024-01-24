package collection;

import java.util.PriorityQueue;
import java.util.Queue;

//created by Ashwini Daware 

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.offer("Ice-cream");
		queue.offer("Pizaa");
		queue.offer("Burger");
		queue.offer("Coffee");
		queue.offer("Tea");
		/// queue.offer(null);

		System.out.println("Priority Queue :" + queue);
		System.out.println("Head of queue :" + queue.element());
		System.out.println("Priority Queue :" + queue);
		System.out.println("Removing from queue :" + queue.poll());
		System.out.println("Priority Queue :" + queue);
		System.out.println("Removing from queue :" + queue.peek());
		System.out.println("Priority Queue :" + queue);

	}

}
