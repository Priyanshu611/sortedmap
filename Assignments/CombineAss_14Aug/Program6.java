class Program6 {

	public static void main(String[] args){

		int num = 15, sum = 0;
		int var = num;

		for(int i = 1; i <= num/2; i++){

			if(num%i == 0)// calculating remainder
				sum = sum + i;//sum of the divisors
		
		}

		if(sum == var)//eqauting sum of the divisors to the orginal number
			System.out.println(var + " is a perfect number");

		else
			System.out.println(var + " is a not perfect number");

	}

}
