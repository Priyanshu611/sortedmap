class Demo2{
		
	void add(int a){
				
		System.out.println("In int method");
				
	}

	void add(float b){
				
		System.out.println("In float method");
				
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.add('A');	
		obj.add(10);	
		obj.add(10l);
		obj.add(10.5f);

	}

}


