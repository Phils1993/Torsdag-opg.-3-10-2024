import java.util.ArrayList;
// 4.f
public class MainGame {

	public static void main (String[]args){
		ArrayList<String> actions = new ArrayList<>();
		//4.f
		actions.add("1) Start Spil");
		actions.add("2) Genoptag spil");
		actions.add("3) sæt spillet på pause");
		actions.add("4) slut spil");
		System.out.print(actions.get(2)); // expected output: "Pause game"

		// 4.g
		GameMenu gameMenu = new GameMenu(actions);

		gameMenu.displayMenu();
	}
}