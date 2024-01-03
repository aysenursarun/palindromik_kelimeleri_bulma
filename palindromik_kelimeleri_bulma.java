package palindromik_kelimeleri_bulma;

import java.util.Scanner;

public class palindromik_kelimeleri_bulma {

		 static boolean isPalindrome(String word) {
		        String reverse = "";
		        for (int i = word.length() - 1; i >= 0; i--) {
		            reverse += word.charAt(i);
		        }

		        if (word.equals(reverse))
		            return true;
		        else
		            return false;
		    }

		    public static void main(String[] args) {
		    	
		    	Scanner scan = new Scanner(System.in);
		    	System.out.print("Kelime girin: ");
		    	String word = scan.nextLine();
		        System.out.println(isPalindrome(word));
	}

}
