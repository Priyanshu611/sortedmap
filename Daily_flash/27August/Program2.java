import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException{

		int ans = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		ans = num1 * num2;
		System.out.printf("Multiplication of %d & %d is: %d\n",num1,num2,ans);

		if(num1>num2){

			ans = num1/num2;
			System.out.printf("Division of %d & %d is: %d\n",num1,num2,ans);

		} else {

			ans = num2/num1;
			System.out.printf("Division of %d & %d is: %d\n",num2,num1,ans);

		}

	}

}
