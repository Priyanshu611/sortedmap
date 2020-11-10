class College {

	class Comp_Dept {

		void Sem5_Sub() {

			System.out.println("Comp_Dept Sem 5th Subjects Consist of:-");
			System.out.println("DBMS");
			System.out.println("TOC");
			System.out.println("SEPM");
			System.out.println("ISEE");
			System.out.println("CN");
			System.out.println();

		}		


	}

	class IT_Dept {

		void Sem5_Sub() {

			System.out.println("IT_Dept Sem 5 Subjects consist of:-");
			System.out.println("OS");
			System.out.println("SEPM");
			System.out.println("DBMS");
			System.out.println("HCI");
			System.out.println("TOC");

		}		


	}

}

class Semester {

	public static void main(String[] args){

		new College().new Comp_Dept().Sem5_Sub();
		new College().new IT_Dept().Sem5_Sub();


	}

}


