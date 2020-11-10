class Program5 {

	public static void main(String args[]){
		
		for(int row = 0; row < 5; row++){

			for(int space = 4; space > row; space--){

				System.out.print("  ");

			}

			
			int a = 1;
	
			for(int col = 0; col <= row; col++){

				System.out.print(a + "  ");
				if(a == 1)
					a--;
			
				else
					a++;

			}

			System.out.println();

		}

	}

}
