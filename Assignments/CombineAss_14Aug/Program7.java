class Program7 {

	public static void main(String[] args){

		int a = 50, b = 70, c = 60;

		if(a < b && a < c){

			System.out.printf("minimum order from %d %d and %d is %d ",a,b,c,a);
			System.out.println();

		} else if(b < a && b < c) {

			System.out.printf("minimum order from %d %d and %d is %d ",a,b,c,b);
			System.out.println();

		} else {

			System.out.printf("minimum order from %d %d and %d is %d ",a,b,c,c);
			System.out.println();

		}

	}

}
