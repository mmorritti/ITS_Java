package cifraturaa;

import java.util.Arrays;
import java.util.Scanner;

public class Crypto {

	public static void main(String[] args) {
		Scanner T = new Scanner(System.in);
		
		char [] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L',
						'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		char [] alphaKey = new char[26];
		
		int lastChar = alpha.length - 1;
		//System.out.println(lastChar);
		
		System.out.println("Inserisci la tua frase");
		String sentence = T.nextLine().toUpperCase().replace(" ", "");
		//System.out.println(frase);
		
		int key = (int)(Math.random() * 26);
		System.out.print("La chiave è: " + key + "\n");
		
		System.out.println(Arrays.toString(alphaKey));//--
		
		//scorrimento array
		/*for(int i = 0; i < key; i++) {
			for(int j = 0; j < lastChar; j++) {
				char tmp = alpha[j];
				alpha[j] = alpha[lastChar];
				alpha[lastChar] = tmp;
			}
		}*/
		
		char [] cryptoSentence = new char[sentence.length()];
		
		for(int i = 0; i < cryptoSentence.length; i++) {
			char tmp = sentence.charAt(i);
		}
		
		
		
		
		
		
		
		
	
		
				
		
		
		
		
	}

}
