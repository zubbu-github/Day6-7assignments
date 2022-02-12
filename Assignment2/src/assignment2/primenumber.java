package assignment2;

  import java.io.BufferedReader;
  import java.io.IOException;
  import java.io.InputStreamReader;


public class primenumber {

	public static void main(String[] args)  throws IOException {
		int temp;
		boolean isPrime=true;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter any number:");
		//capture the input in an integer
		int num = Integer.parseInt(br.readLine());
	        br.close();
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");

	}

}