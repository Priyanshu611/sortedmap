class Parent {

	protected void display(){

		System.out.println("In Parent class");

	}

}

class Child extends Parent {

	public void display(){

		System.out.println("In Child class");

	}

}



class Demo1 {

	public static void main(String[] args){

		Parent obj1 = new Parent();
		obj1.display();

		Child obj2 = new Child();
		obj2.display();

	}

}


