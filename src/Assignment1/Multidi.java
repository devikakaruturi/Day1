package Assignment1;

import java.util.Scanner;

public class Multidi {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter no of rows");
	int row=scanner.nextInt();
	System.out.println("Enter no of columns");
	int col=scanner.nextInt();
	System.out.println("Enter the elements of array");
	int Mx[][]=new int[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			Mx[i][j]=scanner.nextInt();
		}
	}
	System.out.println("Enter the element to be searched");
	int val_s=scanner.nextInt();
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			if(val_s==Mx[i][j])
			{
				System.out.println("Element found");
			}
		}
	}
	scanner.close();
}
}
