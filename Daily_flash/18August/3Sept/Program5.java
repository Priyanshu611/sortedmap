import java .io.*;

class Program5 {	

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("Enter third number: ");
		int num3 = Integer.parseInt(br.readLine());
		
		
		if(num1<num2 && num1<num3)
			System.out.printf("The minimum number amongst %d %d & %d is %d\n",num1,num2,num3,num1);

		else if(num2<num1 && num2<num3)
			System.out.printf("The minimum number amongst %d %d & %d is %d\n",num1,num2,num3,num2);

		else
			System.out.printf("The minimum number amongst %d %d & %d is %d\n",num1,num2,num3,num3);

	}

	
}
