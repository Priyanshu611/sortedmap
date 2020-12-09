class Program4{

	Program4(){

		System.out.println(super);

	}

}
class ChildClass extends Program2=4{

	Child(){

		System.out.println("Child class constructor");

	}


}

class TestClass{

	public static void main(String[] args){

		ChildClass obj = new ChildClass();


	}


}

/*

no we can't print super in java
*/
