class BCCI{

  // instance method
  void impDecision(){

    System.out.println("Decision");
    
  }

  // main method
  public static void main(String[] args){

    BCCI obj1 = new BCCI();
    obj1.impDecision();

    // ipl class is written in another file in the same folder
    IPL obj2 = new IPL();
    obj2.emergingPlayers();

  }

}
