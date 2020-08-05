class COVID19{  //parent class is object class
 
  //default constructor

}

class Lockdown extends COVID19{   // parent class COVID19

 Lockdown(){

   //super();  COVID19() constructor

   System.out.println("In constructor");

 }

  public static void main(String[] args){

    Lockdown obj = new Lockdown();
    System.out.println("Lockdown Extends"); 
  
  }

}
