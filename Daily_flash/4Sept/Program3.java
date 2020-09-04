/*Write a Program to take inpute length & breadth of rectangle and calculate its area


*/

import java.io.*;

class Program3 {

	public static void main(String[] args)throws IOException {

		int area;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);	

		System.out.print("Enter length: ");
		int length = Integer.parseInt(br.readLine());
		System.out.print("Enter breadth: ");
		int breadth = Integer.parseInt(br.readLine());

		area = length * breadth;

		System.out.printf("Area of rectangle: %d\n",area);
	
	}

}

