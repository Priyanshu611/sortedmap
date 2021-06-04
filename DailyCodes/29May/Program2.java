import java.util.*;

class LinkSetDemo {

	public static void main(String[] args){

		LinkedHashSet s = new LinkedHashSet(2);
		s.add("Ashish");
		s.add("Kanha");
		s.add("Rahul");
		s.add("Shashi");
		System.out.println(s.add("Rahul"));
		System.out.println(s.add("Shashi"));
		System.out.println(s.add("Badhe"));
		System.out.println(s);
		System.out.println(s.contains("Ashish"));
		System.out.println(s.size());
	
		System.out.println(s.remove("Badhe"));

		System.out.println(s);
	}


}
