import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException {

		int sum = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a integer: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= num; i++){

			sum = sum + i;

		}

		System.out.println("The sum of numbers upto "+ num + " is " + sum);

	}

}
