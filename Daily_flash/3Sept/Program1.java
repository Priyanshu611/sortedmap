import java.io.*;

class Program1{	

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());

		int sum = 0;
		int var = num;

		for(int i = 1; i <= num/2; i++){

			if(num%i == 0)
				sum = sum + i;

		}

		if(var == sum)
			System.out.println(var + " is a perfect number");

		else
			System.out.println(var + " is not a perfect number");
	}

}
