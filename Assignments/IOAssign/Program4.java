import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException{

		int flag = 0, count = 0;
		String  num = " ";

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter starting number: ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("Enter ending number: ");
		int b = Integer.parseInt(br.readLine());

		System.out.print("Prime numbers are: ");	

		for(int i = a; i <= b; i++){
			
			count = 0;

			for(int j = i; j >= 1; j--){

				if(i%j == 0){

					count++;

				} 

			}

			if(count == 2){

				num = num + i + " ";	

			} 


		}

		System.out.println("The count is: " + count);

		System.out.println(num);
		
		

	}

}


