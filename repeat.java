package guvi;

public class repeat {
	public static void main(String[] args) {
		int [] a=new int [5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=1+i;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					System.exit(0);
				}
			}
		}
		
		
		
	}

}
