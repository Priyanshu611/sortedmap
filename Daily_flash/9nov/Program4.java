class Login {
	
	String username = "spriyanshu";
	String password = "Priyanshu@123";

	Login(String name, String password1) {

		if(username.equals(name) && password.equals(password1))
			System.out.println("Login successful");

		else
			System.out.println("Invalid User!");

	}


	public static void main(String args[]){

		Login obj1 = new Login("spriyanshu","Priyanshu@123");
		Login obj2 = new Login("priyanshu","Priyanshu");

		
	}


}


