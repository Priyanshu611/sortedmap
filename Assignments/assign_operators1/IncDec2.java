class IncDec {

   int a = 10;
   int b = 20;
   int c = 50;
   int ans = 0; 

   void operation(){ //addition

          ans = --a + ++b + c--;
      /*  ans =   9 + 21  + 50


           */
         
          System.out.println("Ans is " + ans); //80

   }

   public static void main(String[] args) {

          IncDec obj = new IncDec();

          obj.operation();//80
          
   }


}



