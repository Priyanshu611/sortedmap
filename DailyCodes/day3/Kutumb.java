class Kutumb{

  //instance variable
  int mob = 1;
  int laptop = 1;

  //static variable
  static int tv = 1;

  void shashiMethod(){

     System.out.println("Mob = " + mob);
     System.out.println("Laptop = " + laptop);
     System.out.println("TV = " + tv);

  }

  void vikasMethod(){

     System.out.println("Mob = " + mob);
     System.out.println("Laptop = " + laptop);
     System.out.println("TV = " + tv);

  }

  public static void main(String[] args){

  Kutumb shashi = new Kutumb();
  shashi.shashiMethod();

  Kutumb vikas = new Kutumb();
  vikas.vikasMethod();
  }

}
