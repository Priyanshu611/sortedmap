class Program4 {

	public static void main(String[] args){

		int a = 1999, b = 2000, c = 1998;

		if((a > b && a < c) || (a < b && a > c))
			System.out.println(a + " is the second largest number");

		else if((b > a && b < c) || (b < a && b > c))
			System.out.println(b + " is the second largest number");

		else if((c > a && c < b) || (c < a && c > b))
			System.out.println(c + " is the second largest number");

	}

}
