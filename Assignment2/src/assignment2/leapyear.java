package assignment2;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class leapyear {

	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a Year");
		int year = Integer.parseInt(br.readLine());
		if(year%100==0 && year%400==0)
			System.out.println("It is a leap Year");
		else if(year%100!=0 && year%4==0)
			System.out.println("It is a leap Year");
		else 
			System.out.println("It is not a leap Year");
	}

}
