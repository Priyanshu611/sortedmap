class Program11 {

	public static void main(String[] args){

		int num = 24, sum = 0;
		int var = num;

		System.out.print("Perfect divisors of " + var + " are: ");

		for(int i = 2; i < num; i++){

			if(num%i == 0)
				System.out.print(i + " ");
				
		}

		System.out.println();
		
	}

}
