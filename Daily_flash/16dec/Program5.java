class Mall{

	protected void Activites(){

		System.out.println("Activites: Shopping, gaming, food court");

	}


}

class Shops extends Mall {

	public void Activites(){

		System.out.println("Activites: Shopping only");

	}


}

class Demo4 {

	public static void main(String[] args){

		Mall obj1 = new Mall();
		obj1.Activites();

		Shops obj2 = new Shops();
		obj2.Activites();

	}


}
