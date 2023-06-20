package IntStack;

import java.util.Scanner;

import charStack.MyStackC;

public class PostfixExpression {
	
	public static int check(String str) 
	{
		Scanner sc= new Scanner(System.in);
		int a,c;
		int r=0;
		int b;
		boolean flag = true;
		MyStackInt s1 = new MyStackInt(str.length());
		for (int i = 0; i < str.length(); i++) 
		{
			char ch=str.charAt(i);
			if (Character.isAlphabetic(ch))
			    {
				//a=str.charAt(i);
				System.out.println("enter the value : "+ch);
				a=sc.nextInt();
				s1.push(a);
				}
			if (ch=='+') 
			{
				int ele1=s1.pop();
				int ele2=s1.pop();
				c=ele2+ele1;
				s1.push(c);
			}
			if (ch=='-') 
			{
				int ele1=s1.pop();
				int ele2=s1.pop();
				c=ele2-ele1;
				s1.push(c);
			}
			if (ch=='*') 
			{
				int ele1=s1.pop();
				int ele2=s1.pop();
				c=ele2*ele1;
				s1.push(c);
			}
			if (ch=='/') 
			{
				int ele1=s1.pop();
				int ele2=s1.pop();
				c=ele2/ele1;
				s1.push(c);
			}
			
		}
		 r=s1.pop();
		 return r;
	}
	public static void main(String[] args) {
		System.out.println("Enter the expression : ");
		Scanner sc= new Scanner(System.in);
          String str=sc.next();
          int result= check(str);
          System.out.println("Answer : "+result);
          
}
}