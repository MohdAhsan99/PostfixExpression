Use MyStack Class to check whether given string is balanced paranthesis or not.



package charStack;

import java.util.Scanner;

public class backetsStackMAIN {

	public static boolean openB(char a) {
		if (a == '{' || a == '[' || a == '(')
			return true;
		else
			return false;

	}

	public static boolean closeB(char a) {
		if (a == '}' || a == ']' || a == ')')
			return true;
		else
			return false;

	}

	public static String check(String str) {
		boolean flag = true;
		MyStackC s1 = new MyStackC(str.length());
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') {
				flag = false;
				break;
			}

			if (openB(str.charAt(i))) {
				s1.push(str.charAt(i));
			}
			if (closeB(str.charAt(i))) {
				char ele1 = s1.pop();
				char ele2 = str.charAt(i);
				if ((ele1 == '[' && ele2 == ']') || (ele1 == '{' && ele2 == '}') || (ele1 == '(' && ele2 == ')')) {
					continue;
				} else {
					flag = false;
					break;
				}
			}

		}
		if (flag == true && s1.isEmpty())
			System.out.println("sucess");
		else
			System.out.println("fail");
		return str;
	}

	public static void main(String[] args) {

		{
			MyStackC s1 = new MyStackC(5);
			char ele;
			int ch = 0;

			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			if (!(s1.isFull())) {
				s = check(s);
			}
		}

	}
}
