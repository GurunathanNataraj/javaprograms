package guvi;

import java.util.Scanner;

public class wordsreverse {
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		
		String s=sa.nextLine();
		String [] s1=s.split(" ");
		
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
		
	}
	

}
