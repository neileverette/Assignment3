import acm.program.*;

public class countUppercase extends ConsoleProgram{
	
	private String keyword;
	
	public void run(){
		askWord();
	}
	
	public String askWord(){
		keyword = readLine("Enter your word: ");
		return keyword;
	}

}
