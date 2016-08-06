package guvi;

import java.util.Scanner;

public class specifictarget {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of an array : ");
		int size=s.nextInt();
		int arr[]=new int [size];
		System.out.println("enter the target : ");
		int target=s.nextInt();
		int a=0;
		int b=0;
		System.out.println("enter the elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		     for(int j=0;j<arr.length;j++)
		     {
		    	 if(arr[i]+arr[j]==target)
		    	 {
		    		 a=arr[i];
		    		 b=arr[j];
		    	 }
		     }
		}
		
		System.out.println("the elements those add and produce target value : "+a+" "+b);
		
		
	}

}
