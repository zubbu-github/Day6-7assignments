package assignment2;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
	public static boolean checkPalindrome(int number){
		int num = 0, digit, revNumber=0;
		num = number;
		while (num != 0){
			digit = num % 10;
			revNumber = (revNumber * 10) + digit;
			num = num / 10;
		}
		if (number == revNumber){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number;
	
		System.out.println("Enter Number: ");
		try{
			number = Integer.parseInt(br.readLine());
			if (checkPalindrome(number)){
				System.out.println("Number '"+number+"' is Palindrome!");
			} else {
				System.out.println("Number '"+number+"' is not Palindrome!");
			}
		} catch(IOException ioe){
			System.out.println("Exception: "+ioe);
		}
	}
}
