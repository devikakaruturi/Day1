package Assignment1;

import java.util.Scanner;

public class Palindrome {
 public static void main(String args[])
 {
	 Scanner sc= new Scanner(System.in);
	 int num=sc.nextInt();
	 int sum=0,r,t;
	 t=num;
	 while(num > 0)
	 {
		 r=num%10;
		 sum=sum*10+r;
		 num=num/10;
	 }
	 if(t==sum)
	 {
		 System.out.println("true");
	 }
	 else
	 {
		 System.out.println("false");
	 }
	 sc.close();
 }
}
