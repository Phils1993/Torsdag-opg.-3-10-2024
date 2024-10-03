import java.util.ArrayList;
import java.util.Scanner;

// 4.a
public class GameMenu{

// 4.b
private ArrayList<String> actions;

//4.c 
	public GameMenu(ArrayList<String> actions){
	// 4.d
	//actions = new ArrayList<>();
		this.actions = actions;
	}

	// 4.h
	public void displayMenu(){
		System.out.println("Game Menu");
		for (String actions : actions){
			System.out.println(actions);
		}
	}

	public String getAction(){
		System.out.println("Write a number to chose a action");
		//displayMenu(actions);
		Scanner scanner = new Scanner (System.in);
		String userChoice = scanner.nextLine();
		return userChoice;
	}
}
