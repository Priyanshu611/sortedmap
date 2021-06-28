class Hospital {

	int x = 10;
	static int y = 20;

	static class Doctors {

		int p = 30;
		static int q = 40;

		void services(){

			System.out.println("Work at Aadhar hospital");
			//System.out.println(x);non static var x cannot be refrenced from static context
			System.out.println(y);
			System.out.println(p);
			System.out.println(q);

		}

	}

	public static void main(String[] args){

		Doctors shah = new Doctors();
		shah.services();


	}


}
