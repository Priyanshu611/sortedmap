class Demo1 {

	void m1(int x, float y){

		System.out.println("Int-float para");

	}

	void m1(float x, int y){

		System.out.println("Float-Int para");

	}

	public static void main(String[] args){

		Demo1 obj = new Demo1();

		obj.m1(10,10.5f);
		obj.m1(10.5f,10);

		//obj.m1(10,10);

		//obj.m1(10.5f,10.5f);			

	}

}
