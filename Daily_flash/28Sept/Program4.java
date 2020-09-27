import java.io.*;

class Program4 {

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.print("Enter side of square: ");
			int side = Integer.parseInt(br.readLine());
		
		
			System.out.printf("Area: %d\n",side*side);
			System.out.printf("Perimeter: %d\n",4*side);


		
	}

}


