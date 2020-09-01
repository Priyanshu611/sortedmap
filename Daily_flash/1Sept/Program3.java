import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{


		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader	br = new BufferedReader(isr);

		System.out.print("Enter the limit: ");
		int limit = Integer.parseInt(br.readLine());

		
		for(int i = 1; i <= limit; i++){

			if(i%2 == 0)//checking the condition
				System.out.printf("Cube of %d: %d and Square of %d: %d\n",i,i*i*i,i,i*i);

		}	

	}

}


