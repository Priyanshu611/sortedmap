import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader	br = new BufferedReader(isr);

		System.out.print("Min of Series: ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("Max of Series: ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.printf("Series of Odd numbers %d & %d is: ",num1,num2);

		for(int i = num1; i <= num2; i++){

			if(i%2 != 0)
				System.out.print(i + " ");

		}

	}

}


