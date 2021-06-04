import java.util.*;

class Prog1 implements Cloneable{

	int x = 10;

	public static void main(String[] args)throws CloneNotSupportedException{

		/*ArrayList al1 = new ArrayList();
		
		al1.add("Priyanshu");
		al1.add("Ria");

		System.out.println(al1);

		ArrayList al2 = new ArrayList();

		al2.add("Shruti");
		al2.addAll(al1);

		System.out.println(al2);*/


		

		Prog1 obj1 = new Prog1();

		Prog1 obj2 = (Prog1)obj1.clone();

		System.out.println(obj1.x);
		System.out.println(obj2.x);

		obj1.x = 20;
	
		System.out.println(obj1.x);
		System.out.println(obj2.x);		

	}


}
