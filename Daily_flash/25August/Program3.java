import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a integer: ");
		int num = Integer.parseInt(br.readLine());

		if(num%2==0)
			System.out.println(num + " is an Even number");

		else
			System.out.println(num + " is an Odd number");

	}

}
