import java.util.ArrayList;


//1a
public class Main {

	public static void main (String[] args){
		// 1.g
		Team team = new Team ("De Uovervindelige ",3);

		// 1.k Bruges ikke
		/*
		teamPlayerNames playerNames = new teamPlayerNames("Benjamin");
		teamPlayerNames playerNames = new teamPlayerNames ("Mikkel");
		teamPlayerNames playerNames = new teamPlayerNames ("Valdemar");
		teamPlayerNames playerNames = new teamPlayerNames ("David");
		teamPlayerNames playerNames = new teamPlayerNames ("Oscar");
		*/

		team.addPlayer("Benjamin");
		team.addPlayer("Mikkel");


		//1.k
		/*
		ArrayList<String> teamPlayerNames = new ArrayList<>();
		teamPlayerNames.add("Benjamin");
		teamPlayerNames.add("Mikkel");
		teamPlayerNames.add("Valdemar");
		teamPlayerNames.add("David");
		teamPlayerNames.add("Oscar");
		*/
	
	// 1.i
	team.setRank(10);
	//System.out.println(teamRank.setRank());


	// 1.j
	System.out.println(team.toString());


	}

}