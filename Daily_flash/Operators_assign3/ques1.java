class BitwiseOperators {

	public static void main(String[] ags){

		int x = 5, y = 10;
		long a = 5, b = 10;
		char ch = 'A', ch1 = 'B';
		float f = 5.03f, f1 = 15.4f;
		double d = 45.23, d1 = 15.25;

		System.out.println("Integer for &: " + (x&y));
		System.out.println("Integer for |: " + (x|y));
		System.out.println("Integer for ^: " + (x^y));
		System.out.println(" ");

		System.out.println("Long for &: " + (a&b));
		System.out.println("Long for |: " + (a|b));
		System.out.println("Long for ^: " + (a^b));
		System.out.println(" ");

		System.out.println("Char for &: " + (ch&ch1));
		System.out.println("Char for |: " + (ch|ch1));
		System.out.println("Char for ^: " + (ch^ch1));
		System.out.println(" ");

               /*  bitwise operators works only for int,long and char   
		   it does not works for float and double because these
 		   operators works bit-by-bit and it is not feasible to 
                   work on bits for float and double.

               */

		System.out.println("Float for &: " + (f&f1));
		System.out.println("Float for |: " + (f|f1));
		System.out.println("Float for ^: " + (f^f1));
		System.out.println(" ");

		System.out.println("Doble for &: " + (d&d1));
		System.out.println("Doble for |: " + (d|d1));
		System.out.println("Doble for ^: " + (d^d1));

	}


}
