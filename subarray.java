package logical;
import java.util.Scanner;
public class subarray {
	
		
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,m;
		System.out.println("Enter size of first array");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		 int a1=0,b1=0;
		 for(int i = 0; i < a.length; i++)
		        {
		        a1=(int) (a1+a[i]*Math.pow(10,a.length-i-1));   
		        }
		System.out.println("Enter size of second array");
		m=s.nextInt();
		int[] b=new int[m];
		System.out.println("Enter "+m+" elements");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		s.close();
		 for(int i = 0; i < b.length; i++)
		        {
		        b1 += b[i]*Math.pow(10,b.length-i-1);   
		        }
		 if(String.valueOf(a1).contains(String.valueOf(b1)))
		 {
			 System.out.println("second array is subarray of first array");
		 }
		 else
		 {
			 System.out.println("not subarray");
		 }
		 
	}
	}



