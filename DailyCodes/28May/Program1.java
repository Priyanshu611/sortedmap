import java.util.*;

class VectorConst {

	public static void main(String[] args){

		Vector v = new Vector();

		System.out.println(v.capacity());

		v.add(10);
		v.addElement(20);
		v.add(10);
		v.add(50);
		v.add(30);
		v.add(40);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		System.out.println(v);

		System.out.println(v.capacity());
		


	}


}
