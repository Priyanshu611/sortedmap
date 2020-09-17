import java.io.*;

class Program5 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr =  new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the series limits: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		for(int i = num1; i <= num2; i++){

			int var = i;
			int fact = 1;

			for(int j = 1; j <= var; j++){

				fact = fact * j;

			}

			System.out.println("Factorial of " + i + " = " + fact);
				

		}

	}

}
