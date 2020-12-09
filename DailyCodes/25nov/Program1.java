class Demo{
		
	void add(double a){
				
		System.out.println("a = " + a);
				
	}

	void add(int a, int b){
				
		System.out.println("add = " + (a+b));
				
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.add(10.53f);	
		obj.add(20,30);	
	
	}

}


