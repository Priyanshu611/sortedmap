import java.io.*;

class IPLTeam {

	String teamName;
	String captain;
	int jerseyNum;
	String franchiseOwner;
	int countofTrophiesWon;

	public static void main(String[] args) throws IOException{

		IPLTeam ipl = new IPLTeam();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter team name: ");
		ipl.teamName = br.readLine();	

		System.out.print("Enter captain name: ");
		ipl.captain = br.readLine();	
		
		System.out.print("Enter jersey number: ");
		ipl.jerseyNum = Integer.parseInt(br.readLine());	
		
		System.out.print("Enter franchise owner: ");
		ipl.franchiseOwner = br.readLine();	

		System.out.print("Enter count of Trophies Won: ");
		ipl.countofTrophiesWon = Integer.parseInt(br.readLine());	

		System.out.println("Team name is: "+ipl.teamName);
		System.out.println("Captain name is: "+ipl.captain);
		System.out.println("Jersey number is: "+ipl.jerseyNum);
		System.out.println("Franchise owner name is: "+ipl.franchiseOwner);
		System.out.println("count of Trophies Won are: "+ipl.countofTrophiesWon);

	}

}


