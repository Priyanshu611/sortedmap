class Program1{

	public static void main(String[] args){

		char ch = 'A';

		//for loop for row
		for(int row = 1; row <= 5; row++){

			//for loop for space
			for(int space = 4; space >= row; space--){

				System.out.print("  ");

			}

			//for loop for column
			for(int col = 1; col <= row; col++){

				System.out.print(ch + " ");
				ch++;

			}

			ch-=(row-1);                    
			System.out.println();
			                            

		}


	}

}
