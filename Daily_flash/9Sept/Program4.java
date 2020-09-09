class Program4{ 
	
	public static void main(String[] args){

		for(int row = 1; row <= 4; row++){

			for(int col = 4; col >= row; col--){

				if(col == 1 || col == 3)
					System.out.print("= ");

				else
					System.out.print("+ ");

			}

			System.out.println();

		}

	}



}
