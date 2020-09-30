class Program5 {

	public static void main(String[] args){

		char[] arr = new char[5];

		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';

		System.out.println("Elements of the array are: ");
		for(int i = 0; i < 5; i++){

			System.out.println(arr[i]);
	
			
		}
		
		System.out.println("Elements of the array are converted to lower case: ");
		for(int i = 0; i < 5; i++){

			System.out.printf("%c\n",(arr[i]+32));
	
			
		}

	

	}



}
