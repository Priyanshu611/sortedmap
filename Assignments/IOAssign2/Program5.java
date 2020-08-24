import java.io.*;

class Program5 {

	
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		if(n%5 == 0 && n%10 == 0)
			System.out.println(n + " is divisible by both 5 and 10");

		else
			System.out.println(n + " is not divisible by both 5 and 10");

	}


}
