package pro;

import java.util.Scanner;

public class pro11 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of childrens : ");
		int input=sc.nextInt();
		int pair=0;
		for(int i=0;i<input;i++)
		{
			for(int j=1+i;j<=input;j++)
			{
				System.out.println(i+" and "+j);
				pair++;
				
			}
		}
		System.out.println("total number of pairs : "+pair);
	}

}
