import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{

		int ans = 0,sq1,sq2,cub1,cub2;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		sq1 = num1*num1;
		sq2 = num2*num2;
		cub1 = num1*num1*num1;
		cub2 = num2*num2*num2;

		ans = cub1+cub2;
		System.out.printf("Addition of %d & %d is: %d\n",cub1,cub2,ans);

		
		ans = sq1-sq2;
		System.out.printf("Subtraction of %d & %d is: %d\n",sq1,sq2,ans);

	}

}
