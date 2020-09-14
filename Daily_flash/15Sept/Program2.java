class Program2{

	public static void main(String[] args){

		//for loop for row
		for(int row = 1; row <= 5; row++){

			int flag = 0;
			//for loop for space
			for(int space = 4; space >= row; space--){

				System.out.print("  ");

			}

			//for loop for column
			for(int col = 1; col <= row; col++){

				if(flag == 0){

					System.out.print(flag + " ");
					flag = 1;

				} else {

					System.out.print(flag + " ");
					flag = 0;

				}
			}
                   
			System.out.println();
			                            

		}


	}

}
