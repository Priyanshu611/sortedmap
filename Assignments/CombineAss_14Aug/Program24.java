class Program24 {

	public static void main(String[] args){

		int num = 123589, count = 0, rem = 0;
		int var = num;

		while(num != 0){

			rem = num%10;

			count++;

			num = num/10;

		}

		System.out.println("number of digits in " + var + " is " + count);

			
	}

}
