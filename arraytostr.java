package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class arraytostr {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array : ");
	int size=s.nextInt();
	int arr []=new int [size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	Arrays.sort(arr);
	String res="";
	for(int i=arr.length-1;i>=0;i--)
	{
		res=res+String.valueOf(arr[i]);
	}
	System.out.println(res);
	
	
	
	
	
	
	
	
	
}
}
