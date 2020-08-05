class IF6 {


	public static void main(String[] args) {

		int x = 10, y = 11;

		if(++x <= y++) { //true

			System.out.println("In IF");
			System.out.println("x = " + x);
			System.out.println("y = " + y);

		} else { 

			System.out.println("In else");
			System.out.println("x = " + x);
			System.out.println("y = " + y);

		}

		System.out.println("Out of If-else statement");//print

	}

}
