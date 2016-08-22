package pro;

import java.util.Scanner;

public class pro51 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE M VALUE : ");
		int m=sc.nextInt();
		System.out.println("ENTER THE N VALUE : ");
		int n=sc.nextInt();
		int g=0;
		int output=0;
		if(m>0)
		{
			if(n>0)
			{
			output=(m*n)-1;	
		g=1;
			}
			else
			{
				System.out.println("INVALID INPUT");
			}
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
		if(g==1)
		{
		System.out.println("MINIMUM NO.OF CUTS : "+output);
		}
	}

}
