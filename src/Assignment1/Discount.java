package Assignment1;

import java.util.Scanner;

public class Discount {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the new item");
		int newitem=scanner.nextInt();
		double discount=newitem*0.35;
		System.out.println("Discount for item is:"+discount);
		double newitemprice=newitem-discount;
		System.out.println("New price of item is:"+newitemprice);
		scanner.close();
	}
}
