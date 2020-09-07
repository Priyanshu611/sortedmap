import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.printf("Before Swap a = %d & b = %d\n",a,b);

		a = a+b;
		b = a-b;
		a = a-b;		
				
		System.out.printf("After Swap a = %d & b = %d\nss",a,b);

	}

}
