/*
			1 2 3 4 5 
			3 4 5 6 
			5 6 7 
			7 8 
			9 



*/


class Program5{

	public static void main(String[] args){
		
		int num = 1;

		//for loop for row
		for(int row = 1; row <= 5; row++){

			//for loop for column
			for(int col = 5; col >= row; col--){

				System.out.printf("%d ",num);
				num++;
				

			}

			num-=(4-row);
			System.out.println();
			                            

		}


	}

}
