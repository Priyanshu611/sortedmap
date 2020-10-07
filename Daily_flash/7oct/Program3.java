class Program3 {

	public static void main(String[] args){

		int arr[][] = new int[3][];

		arr[0] = new int[]{10,9};
		arr[1] = new int[]{8,7,6,5,4,3};
		arr[2] = new int[]{2,1};
		

		System.out.println("Elements of array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){


				System.out.printf("%d\t",arr[i][j]*arr[i][j]*arr[i][j]);

			}

			System.out.println();		

		}




	}

}
