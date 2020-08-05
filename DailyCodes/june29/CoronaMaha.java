class CoronaMaha {

  int count = 170000; //instance variable

  void precaution(){  // instance method

     System.out.println("Use mask");
     System.out.println("Count = " + count);

   }

   static void impDecision(){  // static method

     System.out.println("CM-Decisions");

   }

    public static void main(String[] args){

       CoronaMaha June28 = new CoronaMaha();  //first object
       June28.precaution(); /* Use mask
                               Count = 170000  */
       June28.impDecision(); // CM-Decision
       
       CoronaMaha June29 = new CoronaMaha(); //second object
       June29.count = 175000;  //change in count
       June29.precaution();    /* printing new count
                               Use mask
                               Count = 175000*/

    }

}
