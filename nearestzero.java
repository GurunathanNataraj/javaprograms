package guvi;

import java.util.Scanner;

public class nearestzero {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("Enter the size of the array : ");	
int size=s.nextInt();
int arr[]=new int[size];
int sum=0;
int sum1=0;
int a=0;
int b=0;
for(int i=0;i<arr.length;i++)
{
	arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	for(int j=0+1;j<arr.length;j++)
	{
		sum=Math.abs(arr[i]+arr[j]);
		if(i==0&&j==1)
		{
			sum1=sum;
			a=arr[i];
			b=arr[j];
			
		}
		if(sum<sum1)
		{
			sum1=sum;
			a=arr[i];
			b=arr[j];
		}
		
		
	}
	
}
System.out.println("the two elements those sum is nearest to zero : "+a+" "+b);
		
		}


}
