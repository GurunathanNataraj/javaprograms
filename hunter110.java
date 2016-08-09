package guvi;

import java.util.Scanner;

public class hunter110 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the matrix : ");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		int res=0;
		System.out.println("enter "+size*size+" elements : ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=1;i<size-1;i++)
		{
			for(int j=1;j<size-1;j++)
			{
				res=res+arr[i][j];
			}
		}
		System.out.println("sum of middle elements : "+res);
		}

}
