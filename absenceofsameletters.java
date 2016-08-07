
package logical;

public class absenceofsameletters {
	public static void main(String[] args)
	{
		String str="malayalam";
		char [] c1=str.toCharArray();
		char [] c2=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(c1[i]==c2[j])
				{
					c2[j]='$';
				}
			}
		}
		for(int j=0;j<str.length();j++)
		{
			if(c2[j]=='$')
			{
				continue;
			}
			else
			{
				System.out.print(c2[j]);
			}
		}
		
		
		}

}
