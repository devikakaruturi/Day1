package Assignment1;

import java.util.Scanner;

public class Armstrongr {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,c=0;
		for(i=100;i<=999;i++)
		{
				int ld=i%10;
				int md=(i/10)%10;
				int fd=i/100;
				c=(ld*ld*ld)+(md*md*md)+(fd*fd*fd);
			if(i==c)
			{
				System.out.println(""+i);
			}
		}
		sc.close();
	}
}
