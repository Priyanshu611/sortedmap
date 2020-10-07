class Program5 {

	public static void main(String[] args){

		int sum = 0,count = 0;

		int arr[][] = new int[3][];

		arr[0] = new int[]{50,60,70,90};
		arr[1] = new int[]{20,40,80};
		arr[2] = new int[]{55,77,66,91};

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
			count = 0;

			for(int j = 0; j < arr[i].length; j++){
				
				sum = sum + arr[i][j];
				count++;

			}

			System.out.printf("Average of Student %d is: %d\n",i+1,sum/count);	

			System.out.println();		

		}

	}

}

