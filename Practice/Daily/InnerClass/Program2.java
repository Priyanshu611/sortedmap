class IndianDefence {

	IndianDefence(){

		System.out.println("Major General Narawane");

	}

	static int i = 10;

	class Army {


		
		void attack(){

			System.out.println(i);
			System.out.println("URI Attack");

		}


	}

	class Navy {

		void attack(){

			System.out.println("Gazi Attack");

		}


	}

	class Airforce {

		void attack(){

			System.out.println("Balakot Attack");

		}


	}

}

class Run{

	public static void main(String[] args){

		IndianDefence obj = new IndianDefence();

		IndianDefence.Army army = obj.new Army();
		army.attack();

		IndianDefence.Navy navy = obj.new Navy();
		navy.attack();

		IndianDefence.Airforce air = obj.new Airforce();
		air.attack();

		IndianDefence.Navy def = new IndianDefence().new Navy();
		def.attack();

	}


}
//new IndianDefence().new Army().attack()

