import java.io.*;

class Program1 {

	
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter first number: ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("Enter second number: ");
		int b = Integer.parseInt(br.readLine());	

		System.out.print("Enter a operator: ");
		char op = (char)br.read();	

		
		switch(op){

			case '+':
				System.out.println("Addition: " + (a+b));
				break;

			case '-':
				System.out.println("Subtraction: " + (a-b));
				break;

			case '*':
				System.out.println("Multiplication: " + (a*b));
				break;

			case '/':
				System.out.println("Division: " + (a/b));
				break;

			default:
				System.out.println("No such option");
				break;
			

		}

	}


}
