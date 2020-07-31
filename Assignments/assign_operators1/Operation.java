class Operation {

   int num1 = 15;
   int num2 = 30;
   int ans = 0;

   void addition(){ //addition

          ans = num1 + num2;
         
          System.out.println("Addition is " + ans); //45

   }

   void subtraction(){ //subtraction

          ans = num1 - num2;
         
          System.out.println("Subtraction is " + ans); //-15

   }

   void multiplication(){

          ans = num1 * num2; //multiplcation
         
          System.out.println("Multiplication is " + ans);//450
 
   }

   void division(){

          ans = num1 / num2; //division
         
          System.out.println("Division is " + ans);  //0.5 = 0

   }

   void modulus(){

          ans = num1 % num2; //modulus
         
          System.out.println("Modulus is " + ans); //15

   }


   public static void main(String[] args) {

          Operation arithmetic = new Operation();

          arithmetic.addition();//45
          arithmetic.subtraction(); //-15
          arithmetic.multiplication();//-15
	  arithmetic.division(); //0.5 = 0
	  arithmetic.modulus(); //15

   }


}



