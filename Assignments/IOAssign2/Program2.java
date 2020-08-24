import java.io.*;

class Program2 {

	
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(br.readLine());

		int count = 0;

		for(int i = 1; i <= num/2; i++){

			if(num%i == 0){

				System.out.print(i + " ");
				count++;

			}
				
		}

		if(count == 0)
			System.out.println("The number is divisible by itself only");	


	}


}


