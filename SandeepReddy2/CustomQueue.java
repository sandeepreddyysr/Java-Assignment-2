package omniwyse.SandeepReddy2;

/**
 * This Class implemented Queue DataStructure methods like size,enqueue,dequeue and isEmpty
 *
 */
public class CustomQueue {

	private int queue[];
	private int front;
	private int rear;
	private int count;
	private int capacity;

	public CustomQueue(int size) {
		queue = new int[size];
		front = 0;
		rear = -1;
		count = 0;
		capacity = size;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + queue[front]);

		front = (front + 1);
		count--;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Inserting " + item);

		rear = (rear + 1);
		queue[rear] = item;
		count++;
	}

	public int size() {
		return count;
	}

	public Boolean isEmpty() {
		return (size() == 0);
	}

	public Boolean isFull() {
		return (size() == capacity);
	}

}
