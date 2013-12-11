import acm.program.*;

public class CalcMins extends ConsoleProgram{
	
	public void run(){
		println("Brooke's Minute Calculator");
		
		int days = readInt("How many days would you like to calculate? ");
		
		int minutes = days * 24 * 60;
		int seconds = days * 24 * 60 * 60;
		
		println("There are " + minutes + (" minutes in ") + days + (" days"));
		println("There are " + seconds + (" seconds in ") + days + ("days"));
		
		//   There are ___ seconds in ____ days
	}
	
}
