class Zomato {

	static int y = 20;

	void order(){

		System.out.println("In order method");

		class Hotels {

			int x = 10;

			String hotelName = null;

			Hotels(String hotelName){

				this.hotelName = hotelName;

			}

			void orderPlaced(){
		
				System.out.println("Order Placed at = " + hotelName);
				System.out.println(x);
				System.out.println(y);
			}

		}

		Hotels h = new Hotels("Reddy");
		h.orderPlaced();

	}

	public static void main(String[] args){

		Zomato z = new Zomato();
		z.order();

	}
	

}
