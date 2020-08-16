class Program3 {


	public static void main(String[] args) {

		int num = 345669762;
		int freq = 3, count = 0, rem = 0;
		int var = num;

		while(num != 0)	{	

			rem = num % 10;

			if(rem == freq)
				count++;

			num = num/10;

		}

		System.out.println("The occurence of " + freq + " in " + var + " is " + count);


	}

}
