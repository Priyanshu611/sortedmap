class House {

	class Kitchen {

		void furniture() {

			System.out.println("Kitchen furniture Consist of:-");
			System.out.println("Hob");
			System.out.println("Sink");
			System.out.println("Cabinets,Shelves,Drawers and Trolleys");
			System.out.println("Kitchen Chimney");
			System.out.println("Refrigerator");
			System.out.println();

		}		


	}

	class Bedroom {

		void furniture() {

			System.out.println("Bedroom furnitures consist of:-");
			System.out.println("Bed");
			System.out.println("Wardrobe");
			System.out.println("Dressing table");
			System.out.println("Shelves,cabinet and Chairs or Couch");
			System.out.println("Beside table");

		}		


	}

}

class Furniture {

	public static void main(String[] args){

		new House().new Kitchen().furniture();
		new House().new Bedroom().furniture();


	}


}
