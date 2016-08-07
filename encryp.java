package logical;

import java.util.Scanner;

public class encryp {
public static void main(String[] args) {
	System.out.println("ENTER THE STRING:");
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	String arr []=s1.split(" ");
	String output []=new String [arr.length];
	char keychar=' ';
	int keypos=0;
	//****************************************************************************************************************
	for(int i=0;i<arr.length;i++)
	{
		char c []=arr[i].toCharArray();
		int last=c.length-1;
		int n=0;
		while(n==0)
		{
			if(((c[last]>=65) && (c[last]<=90))||(c[last]>=97)&&(c[last]<=122))
			{
				keychar=c[last];
				n=1;
			}
			else
			{
				last=last-1;
			}
		}
		//***********************************************************************************************************************
		if(keychar>=65&&keychar<=90)
		{
			keypos=(int)(keychar-64);
		}
		if(keychar>=97&&keychar<=122)
		{
			keypos=(int)(keychar-96);
		}
		//*******************************************************************************************************************
		for(int j=0;j<last;j++)
		{
		
			if((keychar>=65&&keychar<=90))
			{
				c[j]=(char)((int)c[j]-keypos);
			
			
			if(c[j]<=64)
			{
				c[j]=(char)((int)c[j]+26);
			}
			}
			if((keychar>=97&&keychar<=122))
			{
				c[j]=(char)((int)c[j]-keypos);
			
			
			if(c[j]<=96)
			{
				c[j]=(char)((int)c[j]+26);
			}
			}
		}
		output[i]=new String(c);	
	}	
	//*********************************************************************************************************************************5
	System.out.println("encrypted string is:");
	for(int i=0;i<output.length;i++)
	{
		System.out.print(output[i]+ " ");
	}
	s.close();
			
		}
	}
	
	
	
	
	
	
	

	
	

