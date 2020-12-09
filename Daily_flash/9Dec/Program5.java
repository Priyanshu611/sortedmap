class Program5{

	int x = 10;

}
class ChildC extends Program5{

	static int y = 20;

	static void m1(){

		System.out.println("x = " + super.x);
		System.out.println("y = " + this.y);

	}


}

class TestC{

	public static void main(String[] args){

		ChildClass.m1();

	}


}

/*
super cannot be refrenced froM a static method

*/

