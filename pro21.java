package pro;

public class pro21 {

	
	public static void main(String[] args) {
	int arr[]={4,2,3,4,2};
	float res1=0;
	float res2=0;
	float count1=0;
	float count2=0;
	float avg1=0;
	float avg2=0;
	int m=0;
	for(int i=0;i<arr.length;i++)
	{
		count1++;
		res1=res1+arr[i];
		avg1=res1/count1;
		for(int j=arr.length-1;j>i;j--)
		{
			res2=res2+arr[j];
			count2++;
			avg2=res2/count2;
		}
		if(avg1==avg2)
		{
			System.out.println("equal");
			m=1;
			break;
		}
		res2=0;
		count2=0;
		
		
	}
	if(m==0)
	{
		System.out.println("not equal");
	}
	}

}
