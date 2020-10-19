class Program2 {

	public static void main(String[] args){

		int arr1[] = new int[]{5,10,15,20,25};

		System.out.println("Array is:");
		for(int i = 0; i < 5; i++){

			System.out.println(arr1[i]);

		}

		int arr2[] = new int[5];

		System.out.println("Reversed array is:");
		for(int i = 0; i < 5; i++){

			arr2[4-i] = arr1[i];

		}

		for(int i = 0; i < 5; i++){

			System.out.println(arr2[i]);

		}

	}

}
