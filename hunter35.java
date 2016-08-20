package hunter;

public class hunter35 {
public static void main(String[] args) {
		String str="acbab";
		String s1="";
		String s2="";
		int m=0;
		for(int i=0;i<str.length();i++)
		{
			 s1=str.substring(0,i);
			 s2=str.substring(i);
			 String s3=s1+s2;
			 String sub1=s3.substring(0,s3.length()/2);
			 String sub2=s3.substring(s3.length()/2);
			 if(sub1.equals(sub2))
			 {
				 System.out.println("repeated string");
				 m=1;
				 break;
			 }
		}
		if(m==0)
		{
System.out.println("not repeated");
	}
}
}
