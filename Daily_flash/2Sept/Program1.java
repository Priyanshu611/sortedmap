import java.io.*;

class Program1 {	
	
	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Min of series: ");
		int num1 = Integer.parseInt(br.readLine());

		System.out.print("Max of series: ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.printf("Series of Even Numbers Ranging between %d & %d is: \n",num1,num2);

		for(int i = num1; i <= num2; i++){

			if(i%2 == 0)
				System.out.print(i + " ");

		}

		System.out.println();

	}

}
