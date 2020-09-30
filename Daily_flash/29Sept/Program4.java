class Program4 {

	public static void main(String[] args){

		float sum = 0, avg = 0;
		char[] arr = new char[5];

		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';

		
		for(int i = 0; i < 5; i++){

			for(int j = 5; j > i; j--){

				System.out.print(arr[i] + " ");
				arr[i]++;			

			}

			
			System.out.println();

		}

	

	}



}
