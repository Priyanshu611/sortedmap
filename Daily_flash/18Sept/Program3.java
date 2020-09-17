import java.io.*;

class Program3 {

	public static void main(String[] args) throws IOException{

		InputStreamReader isr =  new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a number by which you want to increase the series: ");
		int num1 = Integer.parseInt(br.readLine());

		for(int i = 1; i <= 50;){
			
			System.out.print(i + " ");
			i = i + num1;

		}

	}

}
