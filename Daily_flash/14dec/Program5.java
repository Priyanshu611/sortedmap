class Rectangle{

	int length,breadth;
	
	Rectangle(int l,int b){

		length = l;
		breadth = b;

	}

	void perimeter(){

		System.out.println("Perimeter of Rectangle = " + (2*(length+breadth)));

	}

	void area(){

		System.out.println("Area of Rectangle = " + (length+breadth));

	}

}

class Square extends Rectangle{

	int side;
	
	Square(int s){

		super(s,s);
		side = s;

	}

	void perimeter(){

		System.out.println("Perimeter of Square = " + 4*side);

	}

	void area(){

		System.out.println("Area of Square = " + side*side);

	}

}

class Demo3 {

	public static void main(String[] args){

		Rectangle obj1 = new Rectangle(5,6);
		obj1.perimeter();
		obj1.area();

		Square obj2 = new Square(4);
		obj2.perimeter();
		obj2.area();

	}
}


