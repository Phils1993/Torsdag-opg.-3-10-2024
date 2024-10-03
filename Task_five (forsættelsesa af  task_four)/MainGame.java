import java.util.ArrayList;
//import java.util.Scanner;
// 4.f
public class MainGame {

	public static void main (String[]args){
		ArrayList<String> actions = new ArrayList<>();
		//4.f
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) pause the game");
		actions.add("4) END the game GAME OVER !!! XD");

		//Test om print fungere
		System.out.print(actions.get(2)); // expected output: "Pause game"

		// 4.g
		GameMenu gameMenu = new GameMenu(actions);

		gameMenu.displayMenu();

		String userChoice = gameMenu.getAction();
		

		int actionChoice = Integer.parseInt(userChoice);

		doAction(actionChoice);
	}
		// 5.g
		public static void doAction(int action){
			switch (action){
				case 1:
					System.out.println(" You have chosen to start the game");
					break;
				case 2:
					System.out.println(" You have chosen to  previously saved game data");
					break;
				case 3:
					System.out.println("You have chosen to pause the game");
					break;
				case 4:
					System.out.println("You have chosen to END THE GAME! LOSER!");
					break;
				default: 
					System.out.println("INvalid choice!!!");

			}

		}

}