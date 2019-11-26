package omniwyse.SandeepReddy2;

import java.util.Stack;
/**
 * This class is used to check given parenthesis is Balanced or not

 *
 */
public class BalancingOfParenthesis {
	static boolean isMatching(Character character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static boolean isParenthesisBalanced(char parenthesis[]) {
		if(parenthesis.length==0)
		{
			System.out.println("There is no elements....");
			System.exit(0);
			
		}
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < parenthesis.length; i++) 
		{
			if (parenthesis[i] == '{' || parenthesis[i] == '(' || parenthesis[i] == '[') {
				st.push(parenthesis[i]);
			}
			if (parenthesis[i] == '}' || parenthesis[i] == ')' || parenthesis[i] == ']') {
				if(st.isEmpty())
				{
					return false;
				}
				if (!isMatching(st.pop(), parenthesis[i])) 
				{
					return false;
				}
				
			}
		}
		if(st.isEmpty())
		{
			return true;
		}
		else
			return false;
	}

	/*public static void main(String[] args) 
	{
		char parenthesis[] = { '{', '(', ')', '}' };
		if (isParenthesisBalanced(parenthesis)) {
			System.out.println("Parenthesis is Balanced....");
		} else {
			System.out.println("Parenthesis is not Balanced....");
		}
	}*/

}
