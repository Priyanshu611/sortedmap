import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException{

		int ans = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		System.out.print("Enter the sign of operation: ");
		char sign = (char)br.read();

		switch(sign){

			case '+':
				ans = num1+num2;
				System.out.printf("Addition of %d & %d is: %d\n",num1,num2,ans);
				break;

			case '-':	
				ans = num1-num2;
				System.out.printf("Subtraction of %d & %d is: %d\n",num1,num2,ans);
				break;
			
			case '*':
				ans = num1*num2;
				System.out.printf("Multiplication of %d & %d is: %d\n",num1,num2,ans);
				break;

			case '/':	
				ans = num1/num2;
				System.out.printf("Division of %d & %d is: %d\n",num1,num2,ans);
				break;

			case '%':	
				ans = num1%num2;
				System.out.printf("Modulus of %d & %d is: %d\n",num1,num2,ans);
				break;

			default:	
				System.out.printf("No such option\n");
				break;

		}

	}

}

