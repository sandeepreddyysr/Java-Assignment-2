package omniwyse.SandeepReddy2;

import java.util.ArrayList;
import java.util.List;

/**
 * This Class is Used to Reverse the List
 *
 */
public class ListReverse {

	public static List<String> reverseList(List<String> list) {

		ArrayList<String> reverseList = new ArrayList<String>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reverseList.add(list.get(i));
		}
		return reverseList;
	}

}