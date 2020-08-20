import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{

	int ans;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	System.out.print("Enter first number: ");
	int a = Integer.parseInt(br.readLine());

	System.out.print("Enter second number: ");
	int b = Integer.parseInt(br.readLine());	

	System.out.println();
	
	ans = a + b ;
	System.out.println("Addition of " + a + " and " + b + " is: " + ans);
	
	ans = a - b ;
	System.out.println("Subtraction of " + a + " and " + b + " is: " + ans);	

	ans = a * b ;
	System.out.println("Multiplication of " + a + " and " + b + " is: " + ans);

	ans = a / b ;
	System.out.println("Division of " + a + " and " + b + " is: " + ans);

	}

}
