/*print following pattern

	3
	2 3 
	1 2 3
	0 1 2 3 
		

*/

import java.io.*;

class Program4 {

	public static void main(String[] args)throws IOException {

		int num = 3;

		for(int row = 1; row <= 4; row++){
			
			for(int col = 1; col <= row; col++){
				
				System.out.print(num + " ");
				num++;
				
			}

			System.out.println();
			num = 3-row;  

		}

	}

}




