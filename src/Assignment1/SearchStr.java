package Assignment1;
import java.util.Scanner;
public class SearchStr {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Size of string");
		//int n=sc.nextInt();
		String str=sc.nextLine();
		String s1[]= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dave","Kity","Meery","Smith","Jhonson","Bill","William","Jones","Brown","Daves","Miller","Willson","Moore","Taylor","Adason","Thomas","Jackson"};
		int c=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].compareTo(str)==0)
			{
				//System.out.println("True");
				c=c+1;
			}
		}
		System.out.println(+c);
		sc.close();
	}
}
