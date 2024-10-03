import java.util.ArrayList;

//1.b
public class Team {
	//1.c
	private String teamName;
	//1.d
	private int teamRank;
	//1.f
	//private String [] teamPlayerNames {};

	ArrayList<String> teamPlayerNames = new ArrayList<>();

	// constructor
	public Team(String teamName, int teamRank){
		this.teamName = teamName;
		this.teamRank = teamRank;
	}

	// setter 1.h
	public void setRank (int teamRank){
		this.teamRank = teamRank;
	}

	//getter - bruges ikke i opgaven
	//public void getRank(){
		//return this.teamRank;
	

	// toString 
	// 1.j
	public String toString(){
		return " Dit teamnavn er: " + teamName + " \nJeres rang er: " + teamRank + " \n vores nye medlem er " + teamPlayerNames;
	}

	public void addPlayer(String name){
		teamPlayerNames.add(name);

	}

	public 
}