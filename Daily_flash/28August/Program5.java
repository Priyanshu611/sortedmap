import java.io.*;

class Program5 {

	public static void main(String[] args) throws IOException {
	 
		int fact = 1;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= num; i++){


			fact = fact * i;

		}

		System.out.println("Factorial of the entered number is: " + fact);


		}

}
