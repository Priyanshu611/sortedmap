class Addition {

	void add(int a, int b){

		System.out.println("Int Method");
		System.out.println("Addition = " + (a+b));

	}

	void add(int ...vargs){

		System.out.println("Varargs Method");
		int sum = 0;

		for(int i: vargs){

			sum += i;

		}

		System.out.println(sum);

	}


}

class Demo1{

	public static void main(String[] args){

		Addition obj = new Addition();
		obj.add(10,20);
		obj.add(10,20,30,40);

	}


}


