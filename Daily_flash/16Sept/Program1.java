class Program1 {

	public static void main(String[] args){

		for(int row = 1; row <= 5; row++){

			char ch = 'C';

			for(int col = 1; col <= row; col++){

				System.out.print(ch + " ");
				ch+=4;

			}

			System.out.println();
		

		}


	}


}
