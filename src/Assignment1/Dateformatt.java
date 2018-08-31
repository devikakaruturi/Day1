package Assignment1;

import java.io.*;
import java.text.DateFormatSymbols;

public class Dateformatt {
     public static void main(String args[]) throws IOException
     {
    	 BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
    	 String s1=buffer.readLine();
    	 String[] date=s1.split(",");
    	 System.out.println(date);
    	 int x=Integer.parseInt(date[1]);
    	 String mnString;
    	 mnString=new DateFormatSymbols().getMonths()[x+1];
    	 System.out.println(date[0] +"/" +mnString +"/" +date[2]);
     }
}
