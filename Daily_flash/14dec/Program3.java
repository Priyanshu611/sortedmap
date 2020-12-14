class Demo{

	void test(Integer i){

		System.out.println("test(Integer)");

	}

	void test(String name){

		System.out.println("test(String)");

	}


	public static void main(String[] args){

		Demo obj1 = new Demo();
		obj1.test(null);
		

	}
}

/*It gives error as ambiguity is created because bith the cases can have "null"

	hence we can't get hte required output

*/
