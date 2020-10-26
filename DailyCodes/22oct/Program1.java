class ParentExpectation {

	void attendance() {

		System.out.println("They expect 100% attendance");	

	}

	void driving() {

		System.out.println("They expect us to drive max at 40");	

	}

}


class childrenReality extends ParentExpectation {

	void attendance() {

		System.out.println("Reality is less than 75% attendance");	

	}

	void driving() {

		System.out.println("We drive min at 40");	

	}

}

class college {

	public static void main(String[] args){

		ParentExpectation obj1 = new ParentExpectation();
		obj1.attendance();
		obj1.driving();

		childrenReality obj2 = new childrenReality();
		obj2.attendance();
		obj2.driving();

	}

}


