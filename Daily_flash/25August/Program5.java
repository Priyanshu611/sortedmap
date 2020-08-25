import java.io.*;

class Program5 {

	public static void main(String[] args) {
  
		for(int row = 1; row <= 4; row++){

			for(int col = 1; col <= 4; col++){

				if(row == 1 || row == 3)
					System.out.print(0 + " ");

				else
					System.out.print(1 + " ");


			}

			System.out.println();

		}

	}

}
