import java.io.*;

class Program5{ 
	
	public static void main(String[] args) throws IOException{

		int gcd = 0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 2 nos: ");
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());

		for(int i = 1; i <= n1 && i <= n2; i++){

			if(n1%i == 0 && n2%i == 0)
				gcd = i;

		}

		System.out.printf("GCD of %d & %d is %d\n",n1,n2,gcd);

	}

		

}
