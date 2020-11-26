class PlayBooks {

	static class Books {

		void order(){

			System.out.println("Order from Anywhere");

		}

	}

}

class OrderBooks{

	public static void main(String[] args){

		PlayBooks.Books b = new PlayBooks.Books();
		b.order();

	}

}
