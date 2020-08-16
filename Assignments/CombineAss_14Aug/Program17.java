class Program17 {

	public static void main(String[] args){

		int num = 13, flag = 0;
		int var = num;

		for(int i = 2; i <= num/2; i++){

			if(num%i == 0)// calculating remainder
				flag = 1;

		}

		if(flag == 0)
			System.out.println(var + " is a prime number");

		else
			System.out.println(var + " is a prime number");


	}

}
