class Program23 {

	public static void main(String[] args) {

		int num1 = 10, num2 = 15,gcd = 1;

		for(int i = 1; i <= num1 && i <= num2; i++)

			if(num1%i == 0 && num2%i == 0){

				gcd = i;		
			}

		System.out.println("LCM of " + num1 + " and " + num2 + " is " + ((num1*num2)/gcd));


	}

}
