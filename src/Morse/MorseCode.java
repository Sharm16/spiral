package Morse;

import java.util.HashMap;

public class MorseCode {

	public static void main(String[] args) {

		// space between each character and / between each word
		String[] input = {
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- " };
		morseToString(input);

	}

	public static void morseToString(String[] input) {
		
		HashMap<String, String> map = new HashMap<>();



		String[] character = input[0].split(" ");
		map.put(".-", "a");
		map.put("-...", "b");
		map.put("-.-.", "c");
		map.put("-..", "d");
		map.put(".", "e");
		map.put("..-.", "f");
		map.put("--.", "g");
		map.put("....", "h");
		map.put("..", "i");
		map.put(".---", "j");
		map.put("-.-", "k");
		map.put(".-..", "l");
		map.put("--", "m");
		map.put("-.", "n");
		map.put("---", "o");
		map.put(".--.", "p");
		map.put("--.-", "q");
		map.put(".-.", "r");
		map.put("...", "s");
		map.put("-", "t");
		map.put("..-", "u");
		map.put("...-", "v");
		map.put(".--", "w");
		map.put("-..-", "x");
		map.put("-.--", "y");
		map.put("--..", "z");
		map.put("/", " ");
		
		for (int j = 0; j < character.length; j++) {
			
				System.out.print(map.get(character[j]));
				
//				switch (character[j]) {
//				
//				}
//				case ".-":
//					System.out.print("a");
//					break;
//				case "-...":
//					System.out.print("b");
//					break;
//				case "-.-.":
//					System.out.print("c");
//					break;
//				case "-..":
//					System.out.print("d");
//					break;
//				case ".":
//					System.out.print("e");
//					break;
//				case "..-.":
//					System.out.print("f");
//					break;
//				case "--.":
//					System.out.print("g");
//					break;
//				case "....":
//					System.out.print("h");
//					break;
//				case "..":
//					System.out.print("i");
//					break;
//				case ".---":
//					System.out.print("j");
//					break;
//				case "-.-":
//					System.out.print("k");
//					break;
//				case ".-..":
//					System.out.print("l");
//					break;
//				case "--":
//					System.out.print("m");
//					break;
//				case "-.":
//					System.out.print("n");
//					break;
//				case "---":
//					System.out.print("o");
//					break;
//				case ".--.":
//					System.out.print("p");
//					break;
//				case "--.-":
//					System.out.print("q");
//					break;
//				case ".-.":
//					System.out.print("r");
//					break;
//				case "...":
//					System.out.print("s");
//					break;
//				case "-":
//					System.out.print("t");
//					break;
//				case "..-":
//					System.out.print("u");
//					break;
//				case "...-":
//					System.out.print("v");
//					break;
//				case ".--":
//					System.out.print("w");
//					break;
//				case "-..-":
//					System.out.print("x");
//					break;
//				case "-.--":
//					System.out.print("y");
//					break;
//				case "--..":
//					System.out.print("z");
//					break;
//				case "/":
//					System.out.print(" ");
//					break;

				}

			}

		}

	

