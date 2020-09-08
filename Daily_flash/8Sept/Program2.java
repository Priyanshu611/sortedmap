import java.io.*;

class Program2 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter amount in rupees: ");
		int amt = Integer.parseInt(br.readLine());

		System.out.printf("Your amount in rupees is: %d INR\n",amt);

		System.out.printf("Your amount in dollar is: %d$\n",amt*74);

	}

}
