class Overloading{

	void add(int a, int b){

		System.out.println("Sum = " + (a+b));

	}

	void add(int a, float b){

		System.out.println("Sum = " + (a+b));

	}

	void add(float a, int b){

		System.out.println("Sum = " + (a+b));

	}



	public static void main(String[] args){

		Overloading obj1 = new Overloading();
		obj1.add(20,30);
		obj1.add(20,30.5f);
		obj1.add(21.5f,30);
		

	}
}
