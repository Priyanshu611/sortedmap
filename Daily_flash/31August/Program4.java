/*
	0
	1 1
	0 0 0
	1 1 1 1
	0 0 0 0 0


*/

class Program4 {

	public static void main(String[] args) {

		for(int row = 1; row <= 5; row++){

			for(int col = 1; col <= row; col++){

				if(row == 1 || row == 4)
					System.out.print(1 + " ");

				else
					System.out.print(0 + " ");
	
			}

			System.out.println();

		}

	}

}
