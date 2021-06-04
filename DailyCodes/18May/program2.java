import java.util.*;

class ArrayListMethod {

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add("Amazon");
		al.add("Microsoft");
		al.add("Apple");
		al.add("Flipkart");
		al.add("Amazon");

		System.out.println(al);

		//add is used to add at specific index
		al.add(2,"Oracle");

		System.out.println(al);

		//indexOf it gives indexOf particular entry
		System.out.println(al.indexOf("Apple"));

		System.out.println(al.lastIndexOf("Amazon"));

		al.remove(3);		

		System.out.println(al);

		al.remove("Amazon");

		System.out.println(al);

		//clone
		ArrayList al2 = (ArrayList)al.clone();

		System.out.println(al2);
	
		al2.clear();

		System.out.println(al2);
	

	}


}


