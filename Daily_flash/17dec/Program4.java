class Father {

	static void display(){

		System.out.println("In Father class");

	}

}

class Son extends Father {

	static void display(){

		System.out.println("In Son class");

	}

}



class Demo2 {

	public static void main(String[] args){

		Father obj1 = new Son();
		obj1.display();

		

	}

}


