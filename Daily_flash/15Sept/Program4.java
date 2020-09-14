class Program4{

	public static void main(String[] args){

		//for loop for row
		for(int row = 1; row <= 5; row++){

			int num = 1;

			//for loop for space
			for(int space = 1; space < row; space++){

				System.out.printf("\t");
				num++;

			}

			//for loop for column
			for(int col = 5; col >= row; col--){

				System.out.printf("%d\t",num*row);
				num++;
				

			}

			                   
			System.out.println();
			                            

		}


	}

}
