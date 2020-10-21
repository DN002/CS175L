/**
A roach population has an initial starting amount
and goes through cycles of breeding and sprays.
 */
public class RoachPopulation {
		
		private int bugAmt;
		
		/**
		 Constructs a roach population with an initial amount of 10.
		 * @param amount
		 */
		public RoachPopulation(int amount) 
		{
			bugAmt = amount;
		}
/**
	Breeds the roach population by double its amount
 */
		public void breed() 
		{
			bugAmt = bugAmt * 2;
		}
/**
	Sprays the population and kills off a certain amount
	depending on how much is sprayed
	@param amount
 */
		public void spray(double amount) 
		{
			bugAmt = (int) Math.round(bugAmt - (bugAmt * amount));
		}
		
/**
	Gets the current roach amount
	@return
 */
		public int getRoachAmt()
		{
			return bugAmt;
		}
}
