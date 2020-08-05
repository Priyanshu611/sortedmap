class T20{

  static String capt = "Virat Kohli";
         int toss = 0;

  // static method
  static void list(){

    System.out.println("Players list");

  }

  // instance method
  void BatOrBowl(){

    System.out.println("Decision");

  }

  // main method
  public static void main(String[] args){

    System.out.println(capt);

   T20 firstmatch = new T20();
   System.out.println(firstmatch.toss);

  }

}
