class Program4 {

	Program4(int side){

		int area1 = side * side;

		System.out.println("Area of square is: " + area1);


	}

	Program4(int Len,int breadth){

		int area2 = Len * breadth;

		System.out.println("Area of rectangle is: " + area2);


	}

	public static void main(String[] args){

			Program4 obj1 = new Program4(4);	
			Program4 obj2 = new Program4(10,20);	

	}


}

