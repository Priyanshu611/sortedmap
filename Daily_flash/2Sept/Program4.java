class Program4 {	
	
	public static void main(String[] args){

		int num = 1;

		for(int row = 1; row <= 4; row++){

			for(int col = 1; col <= row; col++){

				System.out.print(num*num + "	");
				num++;
		
			}

			System.out.println();

		}

	}

}
