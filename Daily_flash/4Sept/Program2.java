/*accept a number and print its 2nd successor and 2nd predecessor

	input - 50
	second predecessor: 48
	second successor: 52

*/

import java.io.*;

class Program2 {

	public static void main(String[] args)throws IOException {

		int pre,succ;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	

		System.out.print("Enter number: ");
		int num = Integer.parseInt(br.readLine());

		pre = num-2;
		succ = num+2;

		System.out.printf("Second Predecessor: %d\n",pre);
		System.out.printf("Second Successor: %d\n",succ);


		
	}

}

