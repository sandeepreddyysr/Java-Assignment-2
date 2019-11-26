package omniwyse.SandeepReddy2;

import java.util.Arrays;

import java.util.List;
/**
 * This Class implemented List DataStructure methods
 *
 */
public class CustomList {
	public static int size = 0;
	public static final int capacity = 10;
	public static Object elements[] = new Object[capacity];
	public static int count = 0;

	public static void insert(List<Integer> list, int value) {
		size = sizeOfList(list);
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = value;

	}

	public static int find(List<Integer> list, int value) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == value) {
				return list.get(i);
			}
		}
		return -1;
	}

	public static void delete(List<Integer> list, int value) {
		size = sizeOfList(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == value) {
				list.remove(i);
				size--;
			}
		}
	}

	private static void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public static void displayList(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Elements in List " + list.get(i));
			count++;
		}
	}

	public static int sizeOfList(List<Integer> list) {

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			count++;
		}
		return count;

	}

	public static boolean isEmpty(List<Integer> list) {
		Object[] array = list.toArray();
		if (array.length == 0) {
			return true;
		}
		return false;

	}

}
