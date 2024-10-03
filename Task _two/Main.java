import java.util.Scanner; // Import af scanner fra API opg. 2.c

// 2.a
public class Main {

	public static void main(String []args){

	System.out.println("Please enter your name");

	//2.c blokerende kald
	Scanner scanner = new Scanner(System.in);

	// 2.d blokerende kald
	String name = scanner.nextLine();

	// 2.e
	System.out.println("Hello " + name + " please enter your age. ");

	//2.f blokerende kald
	int age = scanner.nextInt();

	// 2.g 
	System.out.println("Hello " + name + " you are " + age + " old, CONGRATULATION :P OLd timer!");

	// 2.h
	System.out.println(" please, tell me your pensionage? ");
	int pensionAge = scanner.nextInt();
	
	int retireMent = pensionAge - age;
	System.out.println( name + " You have before: " + retireMent + " retirement - INVEST MONEY BITCH AND soon retirement");
	

	}

}