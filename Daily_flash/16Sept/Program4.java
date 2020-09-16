class Program4 {

	public static void main(String[] args){

		//for loop for row
		for(int row = 1; row <= 5; row++){

			int flag = 1;
			
			//for loop for column
			for(int col = 1; col <= row; col++){

				if(flag == 1){

					System.out.print(flag + " ");
					flag = 0;

				} else {

					System.out.print(flag + " ");
					flag = 1;

				}
			}
                   
			System.out.println();
			                            

		}


	}

}
