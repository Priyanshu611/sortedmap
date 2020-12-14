class Arithmetic{

	int sum = 0;

	int add(int a, int b){

		sum = a + b;

		return sum;

	}

	

}

class Adder extends Arithmetic {

	Adder(){
	
		System.out.println("Adder is child class of class Arithmetic");

	}
	


}

class Demo{

	public static void main(String[] args){

		Adder obj1 = new Adder();
		obj1.add(20,30);
		System.out.println("Sum = " + obj1.sum);

	}
}
