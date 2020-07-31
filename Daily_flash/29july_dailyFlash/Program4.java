class Program4 {

	static boolean isDivisible(int dividend,int divisor) {//method

              	System.out.println("Dividend = " + dividend);//printing the values
		System.out.println("Divisor = " + divisor);//printing the values

		if((dividend & ((1<<divisor)-1))==0)//checking the condition
			return true;

		else
			return false;

	}


	public static void main(String[] args){

		int a = 8;
		int b = 2;

		if(isDivisible(a,b))
			System.out.println("Yes ");

		else
			System.out.println("No ");

	}

}
