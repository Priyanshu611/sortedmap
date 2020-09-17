import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr =  new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the limits: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		for(int i = num1; i <= num2; i++){

			if(i % 2 == 0)
				System.out.print(i*i + " ");

			else
				System.out.print(i*i*i + " ");

		}

	}

}
