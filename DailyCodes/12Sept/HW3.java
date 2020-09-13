/*
      1 
    1 2 1 
  1 2 3 2 1 
1 2 3 4 3 2 1 




*/

class HW3{

	public static void main(String[] args){


		for(int row = 1; row <= 4; row++){

			int num = 1;

			for(int space = 3; space >= row; space--){

				System.out.print("  ");

			}

			for(int col = 1; col <= 2*row-1; col++){

				System.out.print(num + " ");

				if(col >=row)
					num--;	
			
				else
					num++;

			}

			System.out.println();
			

		}

	}

}
