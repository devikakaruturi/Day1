package Assignment1;

import java.util.Scanner;

	public class Armstrong {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int arm=sc.nextInt();
			int n=arm;
			int c = 0;
			if(arm>0)
			{
				int ld=arm%10;
				int md=(arm/10)%10;
				int fd=arm/100;
				c=(ld*ld*ld)+(md*md*md)+(fd*fd*fd);
			}	
			if(n==c)
			{
				System.out.println("Armstrong number");
			}
			else
			{
				System.out.println("NOT ARMSTRONG");
			}
			sc.close();
		}
	}

