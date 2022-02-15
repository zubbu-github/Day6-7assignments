package assignment2;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

public class armstrong {

	public static void main(String[] args) throws IOException {
		int a,arm = 0,n,temp;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a Number");
		n = Integer.parseInt(br.readLine());
		temp = n;
		while(n!=0)
		{
			a = n%10;
			arm = arm+(a*a*a);
			n= n/10;
	
		}
		if(arm==temp)
			System.out.println(temp+ " is a armstrong number");
		else
			System.out.println(temp+ " is not a armstrong number");
	}

}
