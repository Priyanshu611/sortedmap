import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a integer: ");
		int num = Integer.parseInt(br.readLine());

		System.out.println("The integer you entered is: " + num);

	}

}
