import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input Credit Card Number: "); // Test 4123-5678-9012-3450 and 4123 5678 9012 3450

		while (true) {
			String creditCardNumber = in.nextLine();
			
			if (creditCardNumber.equals("-99")) {
				in.close();
				System.out.println("Goodbye.");
				break;
			}
			
			for (int i = 0; i < creditCardNumber.length();) {
				char ch = creditCardNumber.charAt(i);

				if (ch == '\u0020' || ch == '\u002D') {
					String before = creditCardNumber.substring(0, i);
					String after = creditCardNumber.substring(i + 1);
					creditCardNumber = before + after;
				} else {
					i++;
				}
			}

			System.out.println("Credit Card Number:  " + creditCardNumber);
			System.out.println("Input Credit Card Number or type -99 to end: ");
		}
	}
}
