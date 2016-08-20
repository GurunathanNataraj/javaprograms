package pro;

import java.util.Scanner;

public class pro53 {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE SENTENCE : ");
	String str=sc.nextLine();
	char []chr=str.toCharArray();
	int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
	for(int ij=0;ij<chr.length;ij++)
	{
		if(chr[ij]=='A'||chr[ij]=='a')
		{
			a=1;
		}
		if(chr[ij]=='B'||chr[ij]=='b')
		{
			b=1;
		}
		if(chr[ij]=='C'||chr[ij]=='c')
		{
			c=1;
		}
		if(chr[ij]=='D'||chr[ij]=='d')
		{
			d=1;
		}
		if(chr[ij]=='E'||chr[ij]=='e')
		{
			e=1;
		}
		if(chr[ij]=='F'||chr[ij]=='f')
		{
			f=1;
		}
		if(chr[ij]=='I'||chr[ij]=='i')
		{
			i=1;
		}
		if(chr[ij]=='J'||chr[ij]=='j')
		{
			j=1;
		}
		if(chr[ij]=='K'||chr[ij]=='k')
		{
			k=1;
		}
		if(chr[ij]=='L'||chr[ij]=='l')
		{
			l=1;
		}
		if(chr[ij]=='M'||chr[ij]=='m')
		{
			m=1;
		}
		if(chr[ij]=='N'||chr[ij]=='n')
		{
			n=1;
		}
		if(chr[ij]=='O'||chr[ij]=='o')
		{
			o=1;
		}
		if(chr[ij]=='P'||chr[ij]=='p')
		{
			p=1;
		}
		if(chr[ij]=='Q'||chr[ij]=='q')
		{
			q=1;
		}
		if(chr[ij]=='R'||chr[ij]=='r')
		{
			r=1;
		}
		if(chr[ij]=='S'||chr[ij]=='s')
		{
			s=1;
		}
		if(chr[ij]=='T'||chr[ij]=='t')
		{
			t=1;
		}
		if(chr[ij]=='U'||chr[ij]=='u')
		{
			u=1;
		}
		if(chr[ij]=='V'||chr[ij]=='v')
		{
			v=1;
		}
		if(chr[ij]=='W'||chr[ij]=='w')
		{
			w=1;
		}
		if(chr[ij]=='X'||chr[ij]=='x')
		{
			x=1;
		}
		if(chr[ij]=='Y'||chr[ij]=='y')
		{
			y=1;
		}
		if(chr[ij]=='Z'||chr[ij]=='z')
		{
			z=1;
		}
	}
		if(a==1&&b==1&&c==1&&d==1&&e==1&&f==1&&i==1&&j==1&&k==1&&l==1&&m==1&&n==1&&o==1&&p==1&&q==1&&r==1&&s==1&&t==1&&u==1&&v==1&&w==1&&x==1&&y==1&&z==1)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not a pangram");
		}
		

}
}