package Assignment1;

import java.util.Scanner;

public class CUI {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String username="Devika",password="1234567";
		int n;
		for(int i=0;i<3;i++)
		{
			System.out.println("username");
			String user=scanner.nextLine();
			System.out.println("Password");
			String pass=scanner.nextLine();
			if(user.equals(username)&&pass.equals(password))
			{
				System.out.println("welcome");
				break;
			}
			if(i==2)
			{
				System.out.println("Contact admin");
				break;
			}
			n=i;
			System.out.println("Sorry, try again.No of tries"+ ++n);
		}
		scanner.close();
	}
}
