class Program5{

	public static void main(String[] args) {

		String st1 = "Core2Web";
		String st2 = new String("Core2Web");

		if(st1==st2)
			System.out.println("The strings have same memory location");

		else
			System.out.println("The strings do not have same memory location");

	}

}


