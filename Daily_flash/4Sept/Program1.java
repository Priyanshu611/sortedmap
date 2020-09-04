/*print table in reverse order*/

import java.io.*;

class Program1 {

	public static void main(String[] args)throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	

		System.out.print("Enter number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 10; i >= 1; i--){

			System.out.printf("%d X %2d = %2d\n",num,i,num*i);

		}
	
	}

}

