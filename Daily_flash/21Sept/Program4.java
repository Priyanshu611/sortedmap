import java.io.*;

class Program4 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);	
		BufferedReader br = new BufferedReader(isr); 

		System.out.print("Enter 3 integer values: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		if(num1>num2 && num1>num3)
			System.out.printf("%d is largest number entered amongst %d %d & %d\n",num1,num1,num2,num3);

		else if(num2>num1 && num2>num3)
			System.out.printf("%d is largest number entered amongst %d %d & %d\n",num2,num1,num2,num3);

		else
			System.out.printf("%d is largest number entered amongst %d %d & %d\n",num3,num1,num2,num3);

	}

}
