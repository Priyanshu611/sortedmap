import java.io.*;

class Program5 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter limit: ");
		int limit = Integer.parseInt(br.readLine());

		int sum = 0,j;

		System.out.print("Perfect nos between 1 to "  + limit + " are: ");

		for(int i = 1; i <= limit; i++){

			j = 1;

			while(j <= (i/2)){

				if(i%j == 0)
					sum = sum + j;

				j++;

			}		

			if(sum == i)
				System.out.print(i + " ");

			sum = 0;

		}

	}

}



