import java.io.*;

class Program5 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);	
		BufferedReader br = new BufferedReader(isr); 

		System.out.print("Enter 2 integer values: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		 
		System.out.printf("The sum of %d & %d is %d\n",num1,num2,num1+num2);

	}

}
