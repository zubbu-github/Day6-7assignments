package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class additiondeclared {

	public static void main(String[] args) throws IOException{
		int x = 35, y = 25, sum ;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		  sum =x+y;
		  System.out.println("Sum of two numbers is \n" + sum);
		
	}		 
}
