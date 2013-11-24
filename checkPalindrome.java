import acm.program.*;

public class checkPalindrome extends consoleProgram{
	
	private String keyword;
	
	public void run(){
		askKeyword();
	}
	
	private String askKeyword(){
		keyword = readLine("Enter your word : ");
		return keyword;
	}
}
