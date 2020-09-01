import java.io.*;

class Program5 {

	public static void main(String[] args) throws IOException{


		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader	br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");
		int a = Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());



		if(a>b)
			System.out.printf("The maximum number among %d & %d is %d\n",a,b,a);

		else
			System.out.printf("The maximum number among %d & %d is %d\n",a,b,b);


	}

}
