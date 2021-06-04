import java.util.*;

class ArrayListConst{

	public static void main(String[] args){

		//1st type of const that is empty
		//ArrayList al1 = new ArrayList();
	
		//2nd type const
		//the paramenter passsed here is the capacity that we provide
		//ArrayList al1 = new ArrayList(15);

		//3rd type const
		//the paramenter passsed here is the object of another collection class
		//ArrayList al1 = new ArrayList(obj);

		al1.add(10);
		al1.add(20);
		//capcity() this method is used to check the capacity of that is given by default
		//System.out.println(al1.capacity());//error coz this method is not their n arraylist

		//size() this method gives the no. of elemnents addded to the list
		System.out.println(al1.size());	

	}


}
