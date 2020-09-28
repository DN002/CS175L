import java.util.Scanner;

public class mailMerge {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input first name: ");
		String FirstName = in.next();
		//System.out.println(FirstName);
		
		System.out.println("Input last name: ");
		String LastName = in.next();
		//System.out.println(LastName);
		
		System.out.println("Input House #: ");
		String HouseNum = in.next();
		//System.out.println(HouseNum);
		
		System.out.println("Input Street: ");
		String Street = in.next();
		String Streetpart = in.next();
		//System.out.println(Street);
		
		String text1 = "Dear first last,"; 
		String text2 = "Please confirm that your address is house street detail.";
		String text3 = "Your answer is something";
		
		text1 = text1.replace("first", FirstName);
		text1 = text1.replace("last", LastName);
		text2 = text2.replace("house", HouseNum);
		text2 = text2.replace("street", Street);
		text2 = text2.replace("detail", Streetpart);
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println("Input answer: yes or no?");
		String answer = in.next();
		text3 = text3.replace("something", answer);
		System.out.println(text3);
		
		in.close();
	}

}
