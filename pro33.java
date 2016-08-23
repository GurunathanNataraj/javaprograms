package pro;

import java.util.Scanner;

public class pro33 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string : ");
		String str=sc.nextLine();
		String out="";
		int g=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i+1)>str.charAt(i))
			{
				out=str.substring(i+1);
			    g=1;
				break;
			}
		}
		if(g==1)
		{
			System.out.println("lexicographical String is : "+out);
		}
		else
		{
			System.out.println("lexicographical string is not present");
		}
	}

}
