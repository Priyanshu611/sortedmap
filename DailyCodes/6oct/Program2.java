class Program2 {

	public static void main(String args[]) {


		double arr1[][][] = new double[][][]{ 
		new double[][]{new double[]{1.50,2.56},new double[]{5.52}},
		new double[][]{new double[]{4.10,3.96},new double[]{5.23,6.3,9.84},new double[]{7.56,1.23,4.65}},
		new double[][]{new double[]{4.45,8.30,5.45},new double[]{9.52}}};

		//printing the arrays
		System.out.printf("Elements of array are:\n");
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


