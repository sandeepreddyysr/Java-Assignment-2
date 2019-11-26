package omniwyse.SandeepReddy2;

/**
 * This Class implemented Stack DataStructure methods
 *
 */
public class CustomStack {

	public int index = -1;
	int[] items;

	public CustomStack(int size) {
		items = new int[size];
	}

	public void push(int x) {
		if (index == 99) {
			System.out.println("Stack is full...");
		} else {
			items[++index] = x;
		}
	}

	public int pop() {
		if (index == -1) {
			System.out.println("Underflow stack");
			return '\0';
		} else {
			int element = items[index];
			index--;
			return element;
		}
	}

	public boolean isEmpty() {
		if (index == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return index + 1;
	}
}
