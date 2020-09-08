class Program4 {

	public static void main(String[] args){
		
		int i = 7;

		for(int row = 1; row <= 4; row++){

			for(int col = 1; col <= row; col++){

				System.out.print(i + " ");
				i--;

			}

			System.out.println();
			i = 7-row;

		}

	}

}
