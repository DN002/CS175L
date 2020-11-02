import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AgeCalculation {
	int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	// Represents days of months of a common year
    int month_l[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	//Represents days of months of a leap year
	int m,d,y;		//	Birth date month, day, year
	int tm,td,ty;	//	Current date month, day, year
	
	//	a method looking at whether or not if the year is a leap year
	public static boolean isLeapYear(int y) {
        if (y % 100 == 0) {			//	If the year is evenly divisible by 100, go to next step
            return (y % 400 == 0);	//	If the year is evenly divisible by 400, It is a common year
        } else {					//	If the year is not evenly divisible by 100, go to the next step
            return (y % 4 == 0);	//	If the year is evenly divisible by 4, It is a leap year
        }
    }
	
	//	a method to take the input of the birth date
	public AgeCalculation() throws ParseException {
		String birthdate = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY):");
        m = Integer.parseInt(birthdate.substring(0, 2));	//	parses as integer by making a substring of birth month for calculations
        d = Integer.parseInt(birthdate.substring(3, 5));	//	parses as integer by making a substring of birth day for calculations
        y = Integer.parseInt(birthdate.substring(6, 10));	//	parses as integer by making a substring of birth year for calculations
        
        String mm = birthdate.substring(0, 2);		//	makes a substring of birth month
        String dd = birthdate.substring(3, 5);		//	makes a substring of birth day
        String yy = birthdate.substring(6, 10);		//	makes a substring of birth year
        String birDate = mm+dd+yy;			//	adds the three substrings together
        System.out.println(birDate);		//	Prints the sum of the substrings into the console
        
        SimpleDateFormat newFormat = new SimpleDateFormat("MMddyyyy");		//	An object is made to format the values
        Date date = newFormat.parse(birDate);								//	parses the string into the format; gets recognized as a date
        newFormat.applyPattern("MMMMM, dd yyyy");							//	sets a new format for the date
        String newDate = newFormat.format(date);							//	applies the new format
        System.out.println(newDate);										//	Prints the date in new format into console
        JOptionPane.showMessageDialog(null, "Birthday inputted: "+newDate+".");	//	Prints the date in new format into window
		
        System.out.println(m + " " + d + " " + y);	//	Prints month, day, year with spaces, no format into the console
	}

	//	a method to calculate age according to the date inputed
	public void CalculateAge() {
		String currentdate = JOptionPane.showInputDialog("Enter the currentdate (MM/DD/YYYY):");
		tm = Integer.parseInt(currentdate.substring(0, 2));	//	parses as integer by making a substring of current month
        td = Integer.parseInt(currentdate.substring(3, 5));	//	parses as integer by making a substring of current day
        ty = Integer.parseInt(currentdate.substring(6, 10));//	parses as integer by making a substring of current year
        
        int today_d = td, today_m = tm, today_y = ty;
        int dob_num_days = 0, today_num_days = 0;
        dob_num_days = getToday_num_days(m, d, y, dob_num_days);
        today_num_days = getToday_num_days(today_m, today_d, today_y, today_num_days);

        int days = dob_num_days - today_num_days;
        if (days < 0) days = -days;
        int mo = 0, da = 0;
        if (isLeapYear(today_y)) {			//	Calculates with leap year
            for (int i = 0; i < 12; i++) {
                if (days < month_l[i]) {
                    mo = i;
                    da = days;
                    break;
                } else {
                    days = days - month_l[i];
                }
            }
        } else {							//	Calculates with common year
            for (int i = 0; i < 12; i++) {
                if (days < month[i]) {
                    mo = i;
                    da = days;
                    break;
                } else {
                    days = days - month[i];
                }
            }
        }
        String pattern = "MMMMM, dd yyyy";	//	Sets the date format
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());	//	Uses the date format on todays date
        
		//	shows message in window
        JOptionPane.showMessageDialog(null, "Calculated age is "+(today_y - y) + " years " + mo + " months " + da + " days old.");
        
        //	Prints with todays date in the console
        System.out.println("Your age is "+(today_y - y) +" years "+ mo + " months " + da + " days old and calculated on "+date+".");
    }
	
	//	a method on whether or not to use the correct number of days based on whether or not its a leap year
	private int getToday_num_days(int today_m, int today_d, int today_y, int today_num_days) {
        today_num_days += today_d;
        if (isLeapYear(today_y)) {					//	Calculates amount of days for a leap year
            for (int i = 0; i < today_m - 1; i++)
                today_num_days += month_l[i];
        } else {									//	Calculates amount of days for a common year
            for (int i = 0; i < today_m - 1; i++)
                today_num_days += month[i];
        }
        return today_num_days;
    }
	
	public static void main(String[] args) throws ParseException {
		AgeCalculation a = new AgeCalculation();	//	Creates an object
	    a.CalculateAge();							//	Uses object to call method to calculate age; other methods are used interconnecting
	}
}
