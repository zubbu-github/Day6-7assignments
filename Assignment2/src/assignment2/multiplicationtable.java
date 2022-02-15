package assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class multiplicationtable 
	{
	    public static void main(String args[]) throws IOException
	    {

	    	InputStreamReader isr = new InputStreamReader(System.in);
	    	BufferedReader br = new BufferedReader(isr);

	        System.out.println("Enter Number: ");
	        int num=Integer.parseInt(br.readLine());

	        System.out.println("*****MULTIPLICATION TABLE*****");


	            for(int j=1; j<=10; j++)
	            {
	                System.out.println(num+ "*" +j+ "="  +num*j );
	            }

	    }
	}