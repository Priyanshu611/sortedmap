import java.io.*;

class Program1 {

	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter the number by which you want to increase the series: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 100; i++){

			System.out.printf("%d ",i);
			i = i+(num-1);

		}

		System.out.println();


	}

}
