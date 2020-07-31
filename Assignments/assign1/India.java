class States {

   static int noOfStates = 28;
          int statePopulation = 0;

   static void displayStates(){

      System.out.println("Number of States in India = " + noOfStates);

    }

    void dispPopulation(){

      System.out.println("Population of the state = " + statePopulation);

    }

}

class UnionTerritories {

   static int noOfUnionTerritories = 9;
          int unionTerriPop = 0;//union territories population

   static void dispUnionTerri(){

      System.out.println("Number of Union Territories in India = " + noOfUnionTerritories);

    }

    void dispPopulaton(){

      System.out.println("Population of the Union Territories = " + unionTerriPop);

    }

}


class India {

    public static void main(String[] args){

      States maharashtra = new States();
      maharashtra.statePopulation = 120000000;
      maharashtra.displayStates();
      maharashtra.dispPopulation();

      States gujarat = new States();
      gujarat.statePopulation = 60000000;
      gujarat.displayStates();
      gujarat.dispPopulation();

      UnionTerritories jk = new UnionTerritories();
      jk.unionTerriPop = 20000000;
      jk.dispUnionTerri();
      jk.dispPopulaton();

      UnionTerritories chandigarh = new UnionTerritories();
      chandigarh.unionTerriPop = 1000000;
      chandigarh.dispUnionTerri();
      chandigarh.dispPopulaton();

    }
 
}




