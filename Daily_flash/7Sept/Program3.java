import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{

		int quotient,remainder;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter dividend: ");
		int dividend = Integer.parseInt(br.readLine());
		System.out.print("Enter divisor: ");
		int divisor = Integer.parseInt(br.readLine());

		quotient = dividend / divisor;
		remainder = dividend % divisor;
		
			
		System.out.printf("Quotient: %d\n",quotient);
		System.out.printf("Remainder: %d\n",remainder);

	}

}
