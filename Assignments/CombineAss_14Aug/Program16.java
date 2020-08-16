class Program16 {

	public static void main(String[] args){

		int num = 12, i = 1,rem = 0;
		int var = num;

		System.out.println("These nos divide " + var);
		while(i <= 100){

			rem = num%10;

			if( rem != 0 && var%rem == 0){
				
				System.out.println(i);
				num = num/10;

			}

			i++;

		}

	}

}
