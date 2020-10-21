/**
A class to run a simulation of the RoachPopulation class
 */
public class RoachSimulation {
	
	/**
		Tests the methods of the RoachPopulation class
		@param args
	 */
	public static void main(String[] args) {
		
		// Sets the roach population with an amount of 10
		int amount = 10;
		
		RoachPopulation bugs = new RoachPopulation(amount);
		System.out.println("The Initial Roach population is "+bugs.getRoachAmt());	//Prints the initial roach population amount
		
		bugs.breed();		//	Breeds the roach population for its first cycle
		System.out.println("The Roach population after cycle 1 breeding is "+bugs.getRoachAmt());	//Prints roach amount after breeding first cycle
		bugs.spray(0.5);	//	Sprays the roach population by 50%
		System.out.println("The Roach population after cycle 1 50 percent spraying is "+bugs.getRoachAmt());	//Prints roach amount after getting sprayed first cycle
		
		bugs.breed();		//	Breeds the roach population for its second cycle
		System.out.println("The Roach population after cycle 2 breeding is "+bugs.getRoachAmt());	//Prints roach amount after breeding second cycle
		bugs.spray(0.6);	//	Sprays the roach population by 60%
		System.out.println("The Roach population after cycle 2 60 percent spraying is "+bugs.getRoachAmt());	//Prints roach amount after getting sprayed second cycle
		
		bugs.breed();		//	Breeds the roach population for its third cycle
		System.out.println("The Roach population after cycle 3 breeding is "+bugs.getRoachAmt());	//Prints roach amount after breeding third cycle
		bugs.spray(0.7);	//	Sprays the roach population by 70%
		System.out.println("The Roach population after cycle 3 70 percent spraying is "+bugs.getRoachAmt());	//Prints roach amount after getting sprayed third cycle
		
		bugs.breed();		//	Breeds the roach population for its fourth cycle
		System.out.println("The Roach population after cycle 4 breeding is "+bugs.getRoachAmt());	//Prints roach amount after breeding fourth cycle
		bugs.spray(0.8);	//	Sprays the roach population by 80%
		System.out.println("The Roach population after cycle 4 80 percent spraying is "+bugs.getRoachAmt());	//Prints roach amount after getting sprayed fourth cycle
		
	}

}
