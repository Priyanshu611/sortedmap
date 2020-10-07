class Program1 {

	public static void main(String args[]) {


		double arr1[][][] = {{{1.50,2.56},{5.52}},{{4.10,3.96},{5.23,6.3,9.84}},{{4.45,8.30,5.45},{9.52}}};

		
		System.out.println();

		//printing the arrays
		System.out.printf("Elements of 1st array are:\n");
		System.out.printf("Elements of 1st plane:\n");
		for(int i = 0; i < arr1.length; i++){

			if(i>0)
				System.out.printf("Elements of %d plane:\n",i+1);

			for(int j = 0; j < arr1[i].length; j++){

				for(int k = 0; k < arr1[i][j].length; k++){

					System.out.print(arr1[i][j][k]+ "	");

				}

				System.out.println();

			}

			System.out.println();

		}		

	}

}


