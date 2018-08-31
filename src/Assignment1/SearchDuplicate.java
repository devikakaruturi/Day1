package Assignment1;

import java.util.Scanner;

public class SearchDuplicate {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String dup=scanner.nextLine();
		String dup2="";
		//String dup1[]=dup.split("");
		//Boolean flag; 
		int c=0;
		for(int i=0;i<dup.length();i++)
		{
			char x=dup.charAt(i);
			c=0;
			for(int j=0;j<dup2.length();j++)
			{
				if(x==dup2.charAt(j))
				{
					c++;
				}
			}
				if(c==0)
				{
					dup2+=x;
				}
		}
		System.out.println(dup2);
		scanner.close();
	}
}
