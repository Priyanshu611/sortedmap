class Program3 {

	public static void main(String[] args){
		
		char ch = 'A';

		for(int row = 1; row <= 5; row++){

			for(int col = 5; col >= row; col--){

				System.out.print(ch + " ");

			}

			System.out.println();
			ch++;

		}

	}

}
