class Program3 {

	public static void main(String[] args){

		int n1 = 10, n2 = 20, n3 = 50; //numbers
		System.out.println("Numbers entered are " + n1 + " " + n2 + " " + n3);

		if(n1 > n2 && n1 >n3)
			System.out.println("Largest number is " + n1);

		else if(n2 > n1 && n2 >n3)
			System.out.println("Largest number is " + n2);

		else
			System.out.println("Largest number is " + n3);

	}

}
