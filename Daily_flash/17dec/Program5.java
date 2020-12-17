class ShoppingMall {

	void Activities(){

		System.out.println("Activites - Shopping,Movie,Food");

	}

}

class Theatre extends ShoppingMall {

	void Activities(){

		System.out.println("Activites - Movies");

	}

}



class Demo3 {

	public static void main(String[] args){

		ShoppingMall obj = new ShoppingMall();
		obj.Activities();

		Theatre obj1 = new Theatre();
		obj1.Activities();

		

	}

}


