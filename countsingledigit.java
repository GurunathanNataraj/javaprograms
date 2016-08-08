package guvi;

import java.util.Scanner;

public class countsingledigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the last number : ");
		int n=s.nextInt();
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int count=0;
		for(int i=0;i<=n;i++)
		{
			a=i%10;
			b=(i/10)%10;
			c=(i/100)%10;
			d=(i/1000)%10;
			e=(i/10000);
			if(a==2)
			{
				count++;
			}
			if(b==2)
			{
				count++;
			}
			if(c==2)
			{
				count++;
			}
			if(d==2)
			{
				count++;
			}
			if(e==2)
			{
				count++;
			}
		}
		System.out.println("No.of 2's between 0 and "+n+" are "+count);
	}

}
