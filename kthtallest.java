package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class kthtallest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("enter the position : ");
		int pos=s.nextInt();
		System.out.println(arr.length-pos);
	}

}
