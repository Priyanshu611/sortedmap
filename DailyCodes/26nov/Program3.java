class Core2Web {


}


class Biencaps {

	

}

class Demo3 {

	void m1(Core2Web c2w){

		System.out.println("Core2Web Method");

	}

	void m1(Biencaps bie){

		System.out.println("Biencaps Method");

	}
	
}

class Test2 {

	public static void main(String[] args){

		Demo3 obj = new Demo3();

		obj.m1(new Core2Web());
		obj.m1(new Biencaps());


	}

}


