class Kutumb{

  //instance variable
  int mob = 1;
  int laptop = 1;

  //static variable
  static int tv = 1;

  void display(){

     System.out.println("In display");
     
  }

  // static method
  static void Statdisplay(){

     System.out.println("In static method");
     
  }
}

// main in another class
class  StatDemo{

  public static void main(String[] args){

  Kutumb obj = new Kutumb();
  obj.display();

  // calling static method from main method
   Kutumb.Statdisplay();

  }

}
