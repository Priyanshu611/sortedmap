class Outer {

	class Inner1{

		void m2(){

			System.out.println("In Inner 1");


		}

	} 

	public static void main(String[] args){

		//new Outer().new Inner1().new Inner2().m1();
		Outer obj1 = new Outer();//this is checked by getClass() of Object class
		Outer obj2 = new Outer();
		Inner1 i = obj1.new Inner1();
		i.m2();

	}


}
