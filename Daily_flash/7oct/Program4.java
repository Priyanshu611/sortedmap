class Program4 {

	public static void main(String[] args){

		int sum = 0;

		int arr[][] = new int[4][];

		arr[0] = new int[]{2,3,4,5};
		arr[1] = new int[]{1,2};
		arr[2] = new int[]{5,8,2,1,2};
		arr[3] = new int[]{1,2,7};

		System.out.println("Elements of array are: ");

		for(int i = 0; i < arr.length; i++){

			for(int j = 0; j < arr[i].length; j++){

				System.out.print(arr[i][j] + " ");
			
			}

			System.out.println();		

		}

		//addition of elements
		for(int i = 0; i < arr.length; i++){

			sum = 0;

			for(int j = 0; j < arr[i].length; j++){
				
				sum = sum + arr[i][j];

			}

			System.out.printf("The number of book read by Person %d is: %d\n",i+1,sum);	

			System.out.println();		

		}

	}

}
