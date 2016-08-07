package guvi;

import java.util.Scanner;

public class sumofdigitspalin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number : ");
		int input=s.nextInt();
		int a=0;
		while(input!=0)
		{
			a=a+(input%10);
			input=input/10;
		}
		String s1=String.valueOf(a);
		StringBuffer s2=new StringBuffer(s1);
		s2.reverse();
		s2.toString();
		if(s2.equals(s1))
		{
			System.out.println("sum of digits is palindrome");
		}
		else
		{
			System.out.println("sum of digits is not a palindrome");
		}
	}

}
