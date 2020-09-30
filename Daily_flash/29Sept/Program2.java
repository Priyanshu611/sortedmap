class Program2 {

	public static void main(String[] args){

		int var = 0;
		int[] arr = new int[5];

		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 1;

		System.out.println("Even nos from array are:- ");
		for(int i = 0; i < 5; i++){

			var = arr[i];

			if(var%2 == 0)
				System.out.println(arr[i] + " ");

		}

		

	}



}
