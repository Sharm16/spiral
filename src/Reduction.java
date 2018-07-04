import java.util.ArrayList;

public class Reduction {

	public static void main(String[] args) {
		condense();

	}

	public static void condense() {

		String str = "Digital alarm clocks scare area children";

		ArrayList<Character> array = new ArrayList<Character>();
		for (char c : str.toCharArray()) {
			array.add(c);
		}

		for (int i = 0; i < array.size(); i++) {// looking for space

			String currentLetter = String.valueOf(array.get(i));

			if (currentLetter.matches(" ")) {
				String before = "";
				String after = "";

				for (int j = 0; j < 5; j++) {

					int pos = 1;

					before = String.valueOf(array.get(i - pos-1) + before);
					after = after + String.valueOf(array.get(i + pos));
					System.out.println(before);
					System.out.println(after);
					pos = pos + 1;
 
					if (before.matches(after)) {

						array.remove(i);
						int numberOfLetters = pos-1;
						while (numberOfLetters >= 0) {
							array.remove(i - 1);
						numberOfLetters = numberOfLetters - 1;
						}

					}
				}

			}

		}
		 for (int i = 0; i < array.size(); i++) {
		 System.out.print(array.get(i));
		 }
	}
}
