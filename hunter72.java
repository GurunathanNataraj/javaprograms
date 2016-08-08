package guvi;

public class hunter72 {
	public static void main(String[] args) {
		String str="this is my question";
		String [] s=str.split(" ");
		String [] res=new String[s.length];
		for(int i=0;i<s.length;i++)
		{
			StringBuffer sb=new StringBuffer(s[i]);
			sb.reverse();
			res[i]=sb.toString();
		}
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}

}
