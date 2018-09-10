import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome, would you like a forutune. \n Enter your first name.");
		String name = input.nextLine();
		if (name.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}
		System.out.println("Thank you " + name + " " + lastName + ".");
		System.out.println("How old are you?");
		String age = input.next();
		if (age.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		int ageInt = Integer.parseInt(age);

		System.out.println("I see in what month were you born?");
		String month = input.next();
		if (age.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter");
			System.exit(0);
		}
		int monthInt = Integer.parseInt(month);
		input.nextLine();
		System.out.println(
				"Now what is your favorite ROYGBIV color.\nIf you don't know what ROYGBIV means type \"help\"");
		String roygbiv = input.nextLine();
		if (roygbiv.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		} else {
			while (roygbiv.equalsIgnoreCase("help")) {
				System.out.println("ROYGBIV colors are Red, Orange, Yellow, Green, Blue, Indigo, Violet");
				System.out.println("Please enter a ROYGBIV color.");
				roygbiv = input.next();
				if (roygbiv.equalsIgnoreCase("quit")) {
					System.out.println("Nobody likes a quitter");
					System.exit(0);
				}
			}
			System.out.println("Great last question. How many siblings do you have?");
			String sibling = input.next();
			if (sibling.equalsIgnoreCase("quit")) {
				System.out.println("Nobody likes a quitter");
				System.exit(0);
			}
			int siblingInt = Integer.parseInt(sibling);
			System.out.println("Now for your fortune.");

			int numberOfYears;
			if (ageInt % 2 > 0) {
				numberOfYears = 20;
			} else {
				numberOfYears = 15;
			}
			String home;
			if (siblingInt == 0) {
				home = "Erie, Pennsylvaia";
			} else if (siblingInt == 1) {
				home = "Appleton, Wisconsin";
			} else if (siblingInt == 2) {
				home = "Fargo, Minnesota";
			} else if (siblingInt == 3) {
				home = "Portal, North Dakota";
			} else if (siblingInt > 3) {
				home = "Roswell, New Mexico";
			} else {
				home = "space";
			}
			String transporation = "a";

			if (roygbiv.equalsIgnoreCase("red")) {
				transporation = "Jeep";
			} else if (roygbiv.equalsIgnoreCase("orange")) {
				transporation = "Boat";
			} else if (roygbiv.equalsIgnoreCase("yellow")) {
				transporation = "Air ballon";
			} else if (roygbiv.equalsIgnoreCase("green")) {
				transporation = "Horse";
			} else if (roygbiv.equalsIgnoreCase("blue")) {
				transporation = "Spaceship";
			} else if (roygbiv.equalsIgnoreCase("indigo")) {
				transporation = "Bike";
			} else if (roygbiv.equalsIgnoreCase("violet")) {
				transporation = "Rollerblades";
			}
			double bank;

			if (monthInt <= 4 && monthInt > 0) {
				bank = 2005000.02;
			} else if (monthInt >= 5 && monthInt <= 8) {
				bank = 500000.98;
			} else if (monthInt >= 9 && monthInt <= 12) {
				bank = 1000000.67;
			} else {
				bank = 0.00;
			}
			System.out.println(name + " " + lastName + " will retire in " + numberOfYears + " years, with " + bank
					+ "$ in the bank, " + " a vacation home in " + home + " and travl by " + transporation + ".");

			input.close();

		}
	}
}