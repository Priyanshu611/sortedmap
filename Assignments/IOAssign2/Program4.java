import java.io.*;

class Program4 {

	
	public static void main(String[] args) throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter range1: ");
		int r1 = Integer.parseInt(br.readLine());

		System.out.print("Enter range2: ");
		int r2 = Integer.parseInt(br.readLine());

		System.out.print("Square ");			
		
		for(int i = r1; i <= r2; i++){ 
		
			System.out.print(i*i + " ");

		}

		System.out.println();
		System.out.print("Cube ");

		for(int i = r1; i <= r2; i++){ 
		
			System.out.print(i*i*i + " ");

		}

		System.out.println();

	}


}
