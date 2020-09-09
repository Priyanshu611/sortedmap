import java.io.*;

class Program1{ 
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the limit: ");
		int limit = Integer.parseInt(br.readLine());
		
		for(int i = limit; i >= 1; i--){

			if(i%2 != 0)
				System.out.print(i + " ");

		}

		System.out.println();

	}

}


