class Program2 {

	public static void main(String[] args){

		for(int row = 1; row <= 3; row++){

			for(int space = 2; space >= row; space--){

				System.out.print("  ");

			}

			for(int col = 1; col <= 3; col++){

				System.out.print("* ");

			}

			System.out.println();

		}

	}

}
