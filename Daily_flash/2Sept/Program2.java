import java.io.*;

class Program2 {	
	
	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		if(num1>num2)
			System.out.printf("The maximum number among %d & %d is %d\n",num1,num2,num1);

		else
			System.out.printf("The maximum number among %d & %d is %d\n",num1,num2,num2);


	}

}
