class Program1 {

	public static void main(String[] args){

		int sum = 0;
		int[] arr = new int[5];

		arr[0] = 20;
		arr[1] = 10;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 15;

		for(int i = 0; i < 5; i++){

			sum = sum + arr[i];

		}

		System.out.println("Score of entire team is: " + sum);

	}



}
