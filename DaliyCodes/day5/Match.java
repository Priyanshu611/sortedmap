class Match{

  static String capt = "Virat Kohli";
         int toss = 0;

  // static method
  static void list(){

    System.out.println("Players list");
    System.out.println(capt);

    Match obj = new Match();
    System.out.println(obj.toss);
  }

  // instance method
  void BatOrBowl(){

    System.out.println("Decision");
    System.out.println(capt); 
    System.out.println(toss);

  }

  // main method
  public static void main(String[] args){

   list(); // calling static method

   Match firstmatch = new Match();
   firstmatch.BatOrBowl();

  }

}
