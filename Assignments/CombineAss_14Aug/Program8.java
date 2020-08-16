class Program8 {

	public static void main(String[] args){

		int num = 781, rem = 0;
		int var = num;

		while(num!=0){
			
			int flag = 0;

			rem = num%10;

			for(int i = 2; i <= rem/2; i++){

				if(rem%i == 0)
					flag = 1;

			}

			if(flag == 0){

				System.out.println(rem + " is a prime number from the value " + var);

			} 

			num = num/10;

		}

	}

}
