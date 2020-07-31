class IncDec {

   int a = 10;
   int b = 20;
   int c = 50;
   int ans = 0; 

   void operation(){ //addition

          ans = a++ + ++b + ++c;
      /*  ans = 10  + 21  + 51


           */
         
          System.out.println("Ans is " + ans); //82

   }

   public static void main(String[] args) {

          IncDec obj = new IncDec();

          obj.operation();//82
          
   }


}



