class Program15 {

	public static void main(String[] args){

		int num = 123,rem = 0,count = 0;
		int var = num;

		while(num != 0){

			num = num/2;
			count++;
      
		}

			System.out.println("steps required for reducing " + var + " = " + count);

	}

}
