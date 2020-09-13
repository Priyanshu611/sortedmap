/*
        1 
      A A A 
    3 3 3 3 3 
  B B B B B B B 
5 5 5 5 5 5 5 5 5 




*/

class HW4{

	public static void main(String[] args){

		int num = 1;		
		char ch = 'A';
		

		for(int row = 1; row <= 5; row++){

			for(int space = 4; space >= row; space--){

				System.out.print("  ");

			}

			for(int col = 1; col <= 2*row-1; col++){

				if(row == 2||row == 4){

					System.out.print(ch + " ");			
					

				 }else{

					System.out.print(num + " ");	
			
				}	
				
			}

			System.out.println();
			num++;
			if(row == 2||row == 4)
				ch++;

		}

	}

}
