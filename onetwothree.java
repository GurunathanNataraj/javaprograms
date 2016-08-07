package logical;

public class onetwothree {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int numDup=num;
		int len=0;
		while(numDup!=0)
		{
			numDup=numDup/10;
			len++;
		}
		
		int arr[]=new int[len];
		int numDup2=0;
		while(num!=0)
		{
			numDup2=numDup2*10;
			numDup2=numDup2+num%10;
			num=num/10;
		}
		//System.out.println(numDup2);
		int l=0;
		int result=0;
		while(numDup2!=0)
		{
			arr[l]=numDup2%10;
			numDup2=numDup2/10;                 
			l++;
		for(int j=0;j<l;j++)
		{
		result=result+arr[j];
		}
		}
		System.out.println(result);
	}

}
