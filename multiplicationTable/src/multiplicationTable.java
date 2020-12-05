
public class multiplicationTable {

	public static void main(String[] args) {

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++) {
				System.out.printf("%4d", x*y);
			}
			System.out.println();
		}
	}
}