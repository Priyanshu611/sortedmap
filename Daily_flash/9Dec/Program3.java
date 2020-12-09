class Program3{

	int a = 10;
	
}

class P3 extends Program3{

	System.out.println(this.a);

	


}

class Test2{

	public static void main(String[] args){

		P3 obj = new P3();


	}


}
/*
No we can't print instance var in child class by using this variable

*/
