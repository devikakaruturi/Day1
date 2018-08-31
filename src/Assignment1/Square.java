package Assignment1;

import java.util.Scanner;

public class Square {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value:");
		int num=sc.nextInt();
		System.out.println(num+" * 1 = "+num+", Square is:"+(num*num));
		sc.close();
	}
}
