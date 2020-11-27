class Base {

	void function() {

		System.out.println("In base class");

	}

}

class Derived extends Base {


	void function() {

		System.out.println("In derived class");

	}


}

class Demo {

	public static void main(String[] args){

		Base obj = new Derived();
		obj.function();

	}


}
/*
	No we can't call base class method using child class object in overriding because here that class method is called
	whose object is made and not that class method whose refrence is given.


*/
