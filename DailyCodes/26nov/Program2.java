class Demo2 {

	void m1(String s1){

		System.out.println("In string method");

	}

	void m1(StringBuffer s2){

		System.out.println("In string buffer method");

	}

}

class Test {

	public static void main(String[] args){

		Demo2 obj = new Demo2();

		obj.m1("Shashi");
		obj.m1(new StringBuffer("Shashi"));


	}

}
