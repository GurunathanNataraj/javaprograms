package guvi;


import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		int a []=new int [5];
		for(int i=0;i<args.length;i++)
		{
			a [i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(a);
		for(int i=0;i<a.length-3;i++)
		{
			System.out.print(a[i]+" ");
		}
		}

}
