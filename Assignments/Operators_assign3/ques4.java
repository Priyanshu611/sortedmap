class BitwiseOperators {

	public static void main(String[] ags){

		int x = 5;
		long a = 5;
		char ch = 'A';
		float f = 5.03f;
		double d = 45.23;

		System.out.println("Integer for ~: " + ~(x));
		System.out.println(" ");

		System.out.println("Long for ~: " + ~(a));
		System.out.println(" ");

		System.out.println("Char for ~: " + ~(ch));
		System.out.println(" ");

		System.out.println("Float for ~: " + ~(f));
		System.out.println(" ");

		System.out.println("Double for ~: " + ~(d));
		System.out.println(" ");

               /*  bitwise operators works only for int,long and char   
		   it does not works for float and double because these
 		   operators works bit-by-bit and it is not feasible to 
                   work on bits for float and double.

                  ~ is also a bitwise operator hence it will not work for float and double

               */

		
	}


}
