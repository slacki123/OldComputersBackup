package morseCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Morse {

//	static String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," " };
	static char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
//	static String[] morseCode = new String[] { ".- ", "-... ","-.-. ", "-.. ",". ","..-. ","--. ",".... ",".. ",".--- ","-.- ",".-.. ","-- ","-.", "---",".--. ", "--.- ", ".-. ", "... ", "-", "..- ", "...- ", ".-- ", "-..- ", "-.-- ", "--.. ", "/ " };
	
	static String[] morseCode = new String[] { ".- ", "-... ","-.-. ", "-.. ",". ","..-. ","--. ",".... ",".. ",".--- ","-.- ",".-.. ","-- ","-.", "---",".--. ", "--.- ", ".-. ", "... ", "-", "..- ", "...- ", ".-- ", "-..- ", "-.-- ", "--.. ", "/ " };
	
	static ArrayList<String> translationArr = new ArrayList<String>();
	
	public static ArrayList<String> translateToMorse(String input) {
			
		for (char ch : input.toCharArray()) {
				
			String translation;

			translation = morseCode[indexToMorse(ch)];
			translationArr.add(translation);
		}
		
	return translationArr;
	}
	
	public static ArrayList<String> translateToAlphabet(String input) {
		
		for (char ch : input.toCharArray()) {
				
			String translation;

			translation = morseCode[indexToAlpha(ch)];
			translationArr.add(translation);
		}
		
	return translationArr;
	}
		
	
	
	
   public static int indexToMorse(char input) {
	   for(int i = 0; i<alphabet.length; i++) {
		   if(input==alphabet[i]) {
			   return i;
		   }
	   }
	return 0;
   }

   public static int indexToAlpha(char ch) {
	   for(int i = 0; i<morseCode.length; i++) {
		   if((""+ch).equals(morseCode[i])) {
			   return i;
		   }
	   }
	return 0;
   }
		


}
