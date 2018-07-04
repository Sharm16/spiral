import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {

		String userinput = user();
		String computerinput = computer();
		System.out.println(score(compare(userinput, computerinput)));

	}

	public static String computer() {

		double random = Math.random();
		String a = null;

		if (random >= 0 && random <= 0.3) {
			a= "Rock";

		} else if (random > 0.3 && random <= 0.6) {
			a= "Paper";

		} else {
			a= "Scissors";
		}

		return a;

	}

	public static String user() {
		System.out.println("Type Rock,Paper or Scissors");
		Scanner user = new Scanner(System.in);

		String str = user.nextLine();

		return str;

	}

	public static String compare(String userinput, String computerinput) {

		if (userinput.matches("Rock") && computerinput.matches("Scissors")) { // ypu can't use == on Strings
			return "user ";

		} else if (userinput.matches("Rock") && computerinput.matches("Paper")) {

			return "computer ";
		}

		else if (userinput.matches("Paper") && computerinput.matches("Scissors")) {

			return "computer ";

		} else if (userinput.matches("Paper") && computerinput.matches("Rock")) {

			return "user ";

		} else if (userinput.matches("Scissors") && computerinput.matches("Paper")) {

			return "user ";

		} else if (userinput.matches("Scissors") && computerinput.matches("Rock")) {

			return "computer";

		} else
			return "draw";
	}

	public static String score(String winner) {
		int userScore = 0;
		int computerScore = 0;
		String win=null;

		if (winner.matches("user")) {
			userScore = userScore + 1;
			System.out.println("user is winner");
		} else if (winner.matches("computer")) {
			computerScore = computerScore + 1;
			System.out.println("Computer is winner");
		}
		
		else System.out.println("Draw");

		if (userScore != 5 || computerScore != 5) {
//			String userinput = user();
//			String computerinput = computer();
//			System.out.println(compare(userinput, computerinput));
		}

		else if (userScore == 5) {
			win= "user ";

		}

		else {
			win ="computer ";
		}

		return win;

	}
	
	public static void () {
		System.out.println("Type Rock,Paper or Scissors");
		Scanner user = new Scanner(System.in);

		String userinput = user.nextLine();
		
		double random = Math.random();
		String computerinput = null;

		if (random >= 0 && random <= 0.3) {
			computerinput= "Rock";

		} else if (random > 0.3 && random <= 0.6) {
			computerinput= "Paper";

		} else {
			computerinput= "Scissors";
		}
		
		if (userinput.matches("Rock") && computerinput.matches("Scissors")) { // ypu can't use == on Strings
			return "user ";

		} else if (userinput.matches("Rock") && computerinput.matches("Paper")) {

			return "computer ";
		}

		else if (userinput.matches("Paper") && computerinput.matches("Scissors")) {

			return "computer ";

		} else if (userinput.matches("Paper") && computerinput.matches("Rock")) {

			return "user ";

		} else if (userinput.matches("Scissors") && computerinput.matches("Paper")) {

			return "user ";

		} else if (userinput.matches("Scissors") && computerinput.matches("Rock")) {

			return "computer";

		} else
			return "draw";
		
		
	}
}
