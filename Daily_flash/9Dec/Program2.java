class Program2{

	Program2(){

		System.out.println(this);

	}

}
class Child extends Program2{

	Child(){

		System.out.println("Child class constructor");

	}


}

class Test{

	public static void main(String[] args){

		Child obj = new Child();


	}


}
