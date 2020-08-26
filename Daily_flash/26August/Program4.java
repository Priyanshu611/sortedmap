import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a nuber: "); 
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i<= 10; i++){

			System.out.print(num*i + " ");

		}

	}

}
