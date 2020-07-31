import java.lang.*;


class Constructor{

  int x = 10; // instance varible
   // int x; byte code representation of var x

  Constructor(){

    // x = 10; coz instance var are intialized inside constructor

    System.out.println("In constructor");
  }

   public static void main(String[] args){

      Constructor obj = new Constructor();
      System.out.println("Constructor");
  }

}
