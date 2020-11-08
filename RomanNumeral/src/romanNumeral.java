public class romanNumeral {
	
	/**
	 * A method to convert the integer to Roman Numeral format
	 * @param number which represents the value being converted
	 */
	public void convert(int number) {
		
		//	takes the number to determine the number's value in the 1000's place.
		int value = Math.round(number / 1000);
		int remainder = number % 1000;
		
		//	takes the number to determine the number's value in the 100's place.
		int value1 = Math.round(remainder / 100);
		int remainder1 = remainder % 100;
		
		//	takes the number to determine the number's value in the 10's place.
		int value2 = Math.round(remainder1 / 10);
		int remainder2 = remainder1 % 10;
		
		// takes the number to determine the number's value in the 1's place.
		int value3 = Math.round(remainder2 / 1);

		//	Shows the number in comparison to the converted result
		System.out.println("Integer: " + number);
		System.out.print("Roman Numeral: ");
		
		if (number >= 1000) {
			if (value == 1) {
				System.out.print("M");
			}
			if (value == 2) {
				System.out.print("MM");
			}
			if (value == 3) {
				System.out.print("MMM");
			}
		}
		if (remainder >= 100) {
			if (value1 == 1) {
				System.out.print("C");
			}
			if (value1 == 2) {
				System.out.print("CC");
			}
			if (value1 == 3) {
				System.out.print("CCC");
			}
			if (value1 == 4) {
				System.out.print("CD");
			}
			if (value1 == 5) {
				System.out.print("D");
			}
			if (value1 == 6) {
				System.out.print("DC");
			}
			if (value1 == 7) {
				System.out.print("DCC");
			}
			if (value1 == 8) {
				System.out.print("DCCC");
			}
			if (value1 == 9) {
				System.out.print("CM");
			}
		}
		if (remainder1 >= 10) {
			if (value2 == 1) {
				System.out.print("X");
			}
			if (value2 == 2) {
				System.out.print("XX");
			}
			if (value2 == 3) {
				System.out.print("XXX");
			}
			if (value2 == 4) {
				System.out.print("XL");
			}
			if (value2 == 5) {
				System.out.print("L");
			}
			if (value2 == 6) {
				System.out.print("LX");
			}
			if (value2 == 7) {
				System.out.print("LXX");
			}
			if (value2 == 8) {
				System.out.print("LXXX");
			}
			if (value2 == 9) {
				System.out.print("XC");
			}
		}
		if (remainder2 >= 1) {
			if (value3 == 1) {
				System.out.print("I");
			}
			if (value3 == 2) {
				System.out.print("II");
			}
			if (value3 == 3) {
				System.out.print("III");
			}
			if (value3 == 4) {
				System.out.print("IV");
			}
			if (value3 == 5) {
				System.out.print("V");
			}
			if (value3 == 6) {
				System.out.print("VI");
			}
			if (value3 == 7) {
				System.out.print("VII");
			}
			if (value3 == 8) {
				System.out.print("VIII");
			}
			if (value3 == 9) {
				System.out.print("IX");
			}
		}
		System.out.println("\n");

	}

	/**
	 * The main method that processes the convert method with several different numbers and examples.
	 * @param args
	 */
	public static void main(String[] args) {
		
		romanNumeral toR = new romanNumeral();
		toR.convert(1559);
		toR.convert(2231);
		toR.convert(1);
		toR.convert(25);
		toR.convert(963);
		toR.convert(1999);
		toR.convert(2673);
	}

}
