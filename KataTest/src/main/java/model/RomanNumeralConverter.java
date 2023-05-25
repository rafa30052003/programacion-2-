package model;

public class RomanNumeralConverter {
	 public static String convertToRomanNumeral(int number) {
	        if (number < 1 || number > 10) {
	            throw new IllegalArgumentException("Number must be between 1 and 10");
	        }

	        
	        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

	        StringBuilder sb = new StringBuilder();
	        sb.append(ones[number % 10]);

	        return sb.toString();
	    }
}
