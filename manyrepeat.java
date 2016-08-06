package guvi;

import java.util.Scanner;


public class manyrepeat {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int [size];
	int res[]=new int[size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	int k=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				res[k]=arr[j];
				k++;
			}
		}
	}
	System.out.println("repeating elements are : ");
	for(int i=0;i<k;i++)
	{
		System.out.print(res[i]+" ");
	}
	
	}
}
