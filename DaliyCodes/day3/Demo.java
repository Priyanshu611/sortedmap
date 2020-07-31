class Demo{

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

  Demo shashi = new Demo();
  shashi.mob =0;
  shashi.tv = 0;
  shashi.shashiMethod();

  Demo vikas = new Demo();
  vikas.vikasMethod();
  }

}
