class Program13 {

	public static void main(String[] args){

		int num = 7,sum = 0,rem = 0;
		int squar = num*num;
		
		while(squar != 0){

			rem = squar%10;
			sum = sum + rem;
			squar = squar/10;

		}

		
		if(num == sum)
			System.out.println(num + " is a neon number");

		else
			System.out.println(num + " is not a neon number");

	}

}
