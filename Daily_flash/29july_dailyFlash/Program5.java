class Program5 {

	static int isEven(int number) {//method

		System.out.println("Number = " + number);//printing the values

		if((number ^ 1) == number+1)//checking the condition
			return 1;

		else
			return 0;

	}


	public static void main(String[] args){

		int number = 100;

		if(isEven(number)==0)
			System.out.println("Odd");

		else
			System.out.println("Even ");

	}

}
