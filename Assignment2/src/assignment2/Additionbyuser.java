package assignment2;

    import java.io.BufferedReader; 
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    public class Additionbyuser {
	
	public static void main(String[] args) throws IOException{
		int sum;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		 System.out.println("Enter the first number");
		 int x = Integer.parseInt(br.readLine());
		 System.out.println("Enter the second number");
		 int y = Integer.parseInt(br.readLine());
		 
		 sum = x+y;
		 System.out.println("Sum of two numbers is \n" + sum);
		 
	}		 
}
