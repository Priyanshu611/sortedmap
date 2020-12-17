class FastFood{

	String popularity(){

		System.out.println("Fast Food is popular among 85 million people");

		return "Harmful for health";

	}


}

class Pizza extends FastFood{

	String popularity(){

		System.out.println("Pizza is popular among 55 million people");

		return "21% eat weekly";
	}


}

class Demo2 {

	public static void main(String[] args){

		String s1,s2;

		FastFood obj1 = new FastFood();
		s1 = obj1.popularity();
		System.out.println(s1);

		Pizza obj2 = new Pizza();
		s2 = obj2.popularity();
		System.out.println(s2);

	}


}


