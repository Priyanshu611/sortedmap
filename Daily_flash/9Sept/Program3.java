import java.io.*;

class Program3{ 
	
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter time(in hours): ");
		int hrs = Integer.parseInt(br.readLine());
		
	
		System.out.println(hrs*3600 + " seconds");

	}


}
