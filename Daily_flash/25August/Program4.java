import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException {

		int sum = 0;
		float avg = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 10 integer: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		int num4 = Integer.parseInt(br.readLine());
		int num5 = Integer.parseInt(br.readLine());
		int num6 = Integer.parseInt(br.readLine());
		int num7 = Integer.parseInt(br.readLine());
		int num8 = Integer.parseInt(br.readLine());
		int num9 = Integer.parseInt(br.readLine());
		int num10 = Integer.parseInt(br.readLine());

		sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
		avg = sum/10;

		System.out.println("Sum of 10 entered nos is: " + sum);
		System.out.println("Average of 10 entered nos is: " + avg);


	}

}
