class Program2 {

	public static void main(String[] args){

		for(int row = 1; row <= 4; row++){

			char ch = 'A';

			for(int space = 0; space < row; space++){

				System.out.print("  ");
			
			}

			for(int col = 4; col >= row; col--){

				System.out.print(ch + " ");
				ch++;

			}

			System.out.println();
		

		}


	}


}
