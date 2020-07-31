class Instagram {

    static void myMethod(Instagram obj){
		
	   System.out.println((obj instanceof Instagram) ? "Object belongs to class Instagram" : "Object doesn't belong to class Instagram");
    
    }

}


class Facebook {

	public static void main(String[] args){

		Instagram i = new Instagram();

		Instagram.myMethod(i);


	}

}

