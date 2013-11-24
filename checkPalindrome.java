import acm.program.*;

public class checkPalindrome extends ConsoleProgram{
	
	private String keyword;
	
	public void run(){
		askKeyword();
		checkWord(keyword);
	}
	
	private String askKeyword(){
		keyword = readLine("Enter your word : ");
		return keyword;
	}
	
	private void checkWord(String keyword){
		
	}
}
