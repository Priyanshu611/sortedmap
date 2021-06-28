class Admission {

	Admission(String field){
		
		if(field == "Medical")
			NEET();

		else if(field == "Engineering")
			JEE();

	}

	void NEET(){

		class Gov {

			void college(){

				System.out.println("AIIMS");

			}

		}

		class Private {

			void college(){

				System.out.println("SKN");

			}

		}

		Private pvt = new Private();
		pvt.college();

	}

	void JEE(){

		class Gov {

			void college(){

				System.out.println("C.O.E.P");

			}

		}

		class Private {

			void college(){

				System.out.println("VIT");

			}

		}

		Gov clg = new Gov();
		clg.college();

	}

}

class Decision{

	public static void main(String[] args){

		Admission obj = new Admission("Medical");
		Admission obj1 = new Admission("Engineering");
	}

}


