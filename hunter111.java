package guvi;

import java.util.Scanner;

public class hunter111 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int count1=0;
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			char [] c=s[i].toCharArray();
			if(c.length%2!=0)
			{
				System.out.println(s[i]+" is not balanced");
				continue;
			}
			for(int j=0;j<c.length;j++)
			{
			if((c[j]>='A'&&c[j]<='M')||(c[j]>='a'&&c[j]<='m'))
			{
				count++;
			}
			if((c[j]>='N'&&c[j]<='Z')||(c[j]>='n'&&c[j]<='z'))
			{
				count1++;
			}
		}
		if(count==count1)
		{
			System.out.println(s[i]+" is balanced");
		}
		else
		{
			System.out.println(s[i]+" is not balanced");
		}
		
		}
		
		
	}

}
