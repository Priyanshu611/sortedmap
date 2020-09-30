class Program3 {

	public static void main(String[] args){

		float sum = 0, avg = 0;
		int[] arr = new int[5];

		arr[0] = 15;
		arr[1] = 20;
		arr[2] = 5;
		arr[3] = 4;
		arr[4] = 10;

		
		for(int i = 0; i < 5; i++){

			sum = sum + arr[i];

		}

		avg = sum/5;
		System.out.printf("Average is: %.2f\n",avg);

		

	}



}
