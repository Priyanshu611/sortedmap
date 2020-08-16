class Program9 {

	public static void main(String[] args){

		int num = 365, rem = 0,sum = 0;
		int var = num;

		while(num!=0){

			rem = num%10;

			sum = (sum*10)+rem;	

			num = num/10;

		}

		if(sum == var)
			System.out.println(sum + " is a palindrome number");

		else
			System.out.println(sum + " is not a palindrome number");

	}

}
