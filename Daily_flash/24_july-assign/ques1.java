class Statement {

	int evenOdd(int a, int b){

		System.out.println((a%2==0) ? "a is even number " : "a is odd number");
		
		System.out.println((b%2==0) ? "b is even number " : "b is odd number");

	return 0;

	}

	public static void main(String[] args) {

		Statement obj = new Statement();

		obj.evenOdd(8, 5);

	}

}
