import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TopCustomer {

	/**
	 * The three lines below is where the limit and array lists: names and price
	 * are set.
	 */
	final static int limit = 5;
	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<Double> price = new ArrayList<Double>();

	/**
	 * This method gets the name of the best customer. It finds the max price, then
	 * fetches the index and using that index, fetches the customer's name.
	 * 
	 * @return bestCustomer's name
	 */
	public String nameOfBestCustomer() {
		int maxIndex = price.indexOf(Collections.max(price));
		String bestCustomer = names.get(maxIndex);
		return bestCustomer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 0;

		/**
		 * This while loop checks if the customer's price amount is a double, if it's a
		 * string, then it asks the user to try another input. Within the loop, it
		 * checks the customer's name as well.
		 */
		boolean x = true;
		while (x == true) {
			System.out.println("Enter customer price or enter 0 to stop: ");
			String issue = in.nextLine();
			try {
				Double priceIn = Double.parseDouble(issue);
				if (priceIn == 0) {
					x = false;
					break;
				}
				// add price to array
				price.add(counter, priceIn);

				/**
				 * This while loop checks if the customer's name is a double or not, and if it's
				 * a valid string, then the name is added to the array.
				 */
				boolean y = true;
				while (y == true) {
					System.out.println("Enter customer name: ");
					String nameIn = in.nextLine();
					try {
						@SuppressWarnings("unused")
						double numVal = Double.valueOf(nameIn);
						System.out.println("Your input contains numbers.. Enter a proper name.\n");
					} catch (NumberFormatException e) {
						// add name to array
						names.add(counter, nameIn);
						y = false;
						break;
					}
				}

				counter++;
				/**
				 * This if statement checks if the counter hits the array limit, and if it hits
				 * then the it breaks the loop, finishes up code outside the loop in the main
				 * method
				 */
				if (counter == limit) {
					System.out.println("\nLimit reached. Limit was set to " + limit + ". Closing, sorry.");
					System.out.println("To change limit, the value is a global variable at the top.\n");
					x = false;
					break;
				}
			} catch (NumberFormatException e1) {
				System.out.println("This looks incorrect. Price can't be a String. Try again.");
				System.out.println("-------------------------------------------------------------------");
			}
		}

		/**
		 * These print statements show what names and prices are in the arrays.
		 */
		System.out.println("Names entered in order: " + names);
		System.out.println("Amount customers spent in order: " + price);
		System.out.println("-------------------------------------------------------------------");

		/**
		 * This makes an object for the top customer, calls the nameOfBestCustomer
		 * method. Prints customer's name and amount they spent.
		 */
		TopCustomer top = new TopCustomer();
		System.out.println(
				"Best customer's name: " + top.nameOfBestCustomer() + "\nThis person spent: " + Collections.max(price));

		in.close();
	}
}
