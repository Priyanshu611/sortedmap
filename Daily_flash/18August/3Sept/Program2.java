import java.io.*;

class Program2 {	

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());
		
		for(int i = num1; i <= num2; i++){
			
			int num = i,fact = 1;

			while(num>0){

				fact = fact * num;
				num--;

			}

			System.out.printf("Factorial of %d = %d\n",i,fact);	
			
		}

	
		
	}

}
