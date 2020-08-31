/*accept a number and print all of its perfect divisors*/

import java.io.*;

class Program5 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());

		System.out.print("Perfect divisors of " + num + " are: ");

		for(int i = 2; i <= num/2; i++){

			if(num%i == 0){

				System.out.print(i + " ");

			}

		}

	}

}
