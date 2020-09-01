class Program4 {

	public static void main(String[] args){

		for(int row = 1; row <= 5; row++){

			for(int col = 1; col <= row; col++){

				if(row == 2 || row == 4)
					System.out.print("A ");

				else	
					System.out.print("a ");
	
			}

			System.out.println();

		}

	}

}
