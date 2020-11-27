class Calculator {

	void add(int a, int b){

		System.out.println("Addition of 2 digits = " + (a+b));

	}

	void add(int x, int y, int z){

		System.out.println("Addition of 3 digits = " + (x+y+z));

	}


}

class Calculation {

	public static void main(String[] args){

		Calculator obj = new Calculator();
		obj.add(10,20);
		obj.add(10,20,30);

	}


}


