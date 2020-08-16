class Program20 {

	public static void main(String[] args){

		char ch = 'A', con = 'a';

		for(int row = 1; row <= 4; row++){

			for(int col = 1; col <= 4; col++){

				if(row == 1 || row == 3){

					System.out.print(ch + "  ");
					ch++;

				} else {

					System.out.print(con + "  ");
					con++;

				}

			}

			System.out.println();
	
		}

	}

}
