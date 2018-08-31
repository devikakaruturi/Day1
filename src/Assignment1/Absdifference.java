package Assignment1;

import java.io.BufferedReader;
import java.io.*;

public class Absdifference {
public static void main(String args[]) throws IOException
{
	BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of the array");
	int size = Integer.parseInt(buffer.readLine());
	int arr[] = new int[size];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<size-1;i++)
	{
		arr[i] = Integer.parseInt(buffer.readLine());
	}
	System.out.println("Enter the value of k");
	int k = Integer.parseInt(buffer.readLine());
	for(int i=0;i<size-1;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(Math.abs(i-j) <= k)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Such a pair exists at " + (i+1) + "and" + (j+1));
				}
			}
		}
	}
}
}
