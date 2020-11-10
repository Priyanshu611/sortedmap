class Bank {

	class AccountHolder {

		void info() {

			System.out.println("Rules to become a Account_Holder:-");
			System.out.println("Must have Aadhar Card");
			System.out.println("Should be an India residential");
			System.out.println("Address proof required");
			System.out.println("No criminal records");
			
			System.out.println();

		}		


	}

	class Account {

		void type() {

			System.out.println("Account Types that you can have:-");
			System.out.println("Savings account");
			System.out.println("Current account");
			System.out.println("Fix deposit account");
			System.out.println("Salary account");

		}		


	}

}

class Branch {

	public static void main(String[] args){

		new Bank().new AccountHolder().info();
		new Bank().new Account().type();


	}


}
