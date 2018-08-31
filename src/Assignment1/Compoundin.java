package Assignment1;

import java.util.Scanner;

public class Compoundin {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double p,t,r,Sim,Com;
		System.out.println("Enter the values:");
		p=sc.nextDouble();
		t=sc.nextDouble();
		r=sc.nextDouble();
		Sim=(p*t*r)/100;
		System.out.println(""+Sim);
		Com=p*Math.pow(1.0+r/100.0,t)-p;
		System.out.println(""+Com);
		sc.close();
	}
}
