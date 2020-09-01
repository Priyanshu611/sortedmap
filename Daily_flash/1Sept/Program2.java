import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{

		int temp;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader	br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");
		int a = Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());

		System.out.printf("Before Swap: %d %d\n",a,b);

		temp = a;
		a = b;
		b = temp;

		System.out.printf("After Swap: %d %d\n",a,b);


	}

}


