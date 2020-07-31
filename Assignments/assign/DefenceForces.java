class IndianArmy{

    static int noOfTanks = 3500;
           int MilitaryOperations = 1000; // can differ for different regiments
   
    static void dispTanks(){

       System.out.println("Total number of tanks are: " + noOfTanks);
   
    }

    void dispOperations(){

       System.out.println("Total number of operations done: " + MilitaryOperations);
   
    }

}

class IndianNavy{

    static int noOfShips = 295;
           int MilitaryOperations = 650; // can differ for different departments
   
    static void dispShips(){

       System.out.println("Total number of Ships are: " + noOfShips);
   
    }

    void dispOperations(){

       System.out.println("Total number of operations done: " + MilitaryOperations);
   
    }

}

class IndianAirForce{

    static int noOfAircrafts = 800;
           int MilitaryOperations = 700; // can differ for different departments
   
    static void dispAircrafts(){

       System.out.println("Total number of Aircrafts are: " + noOfAircrafts);
   
    }

    void dispOperations(){

       System.out.println("Total number of operations done: " + MilitaryOperations);
   
    }


}

class DefenceForces{

     public static void main(String[] args){

          IndianArmy gorkhaRegiment = new IndianArmy();
          gorkhaRegiment.MilitaryOperations = 250;//operations done by Gorkha regiment
          gorkhaRegiment.dispTanks();
          gorkhaRegiment.dispOperations();

          IndianNavy INSArihant = new IndianNavy();
          INSArihant.MilitaryOperations = 50;//operatons involving INS Arihant
          INSArihant.dispShips();
          INSArihant.dispOperations();

          IndianAirForce jaguar = new IndianAirForce();
          jaguar.MilitaryOperations = 250;//operatons involving jaguar fighter jet
          jaguar.dispAircrafts();
          jaguar.dispOperations();

     }

}





