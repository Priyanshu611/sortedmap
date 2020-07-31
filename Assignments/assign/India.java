class ChineseApp{

    static int BannedApps = 59;
           int BoycottedProducts = 1000; // can differ for different companies
   
    static void dispBannedApps(){

       System.out.println("Total number of Apps banned are: " + BannedApps);
   
    }

    void dispProducts(){//displays boycotted products count

       System.out.println("Demand level decreased severely for " + BoycottedProducts + " Chinese Products");
   
    }

}

class IndianMarket{

    static int Alternatives = 200;//Indian Altenatives for those 59 apps
           int IncDemand = 6500; //demand has incremented for diff Indian products
   
    static void dispAlternatives(){

       System.out.println("Altenatives present for Chinese Apps: " + Alternatives);
   
    }

    void dispDemand(){

       System.out.println("Demand level incresead for " + IncDemand + " Indian Products");
   
    }

}

class India{

     public static void main(String[] args){

          IndianMarket swadeshi = new IndianMarket();
          swadeshi.IncDemand = 6300;//demand increased for swadeshi products
          swadeshi.dispAlternatives();
          swadeshi.dispDemand();

          IndianMarket startups = new IndianMarket();
          startups.IncDemand = 1300;//new start ups got a way
          startups.dispAlternatives();
          startups.dispDemand();

          ChineseApp china = new ChineseApp();
          china.BoycottedProducts = 1500;// number of products boycotted by indians
          china.dispBannedApps();
          china.dispProducts();//displays boycotted products count

     }

}





