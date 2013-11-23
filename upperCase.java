import acm.program.*;

public class upperCase extends ConsoleProgram{

	public void run(){
	
		askWord();
	}
	
	private String askWord(){
		String word = readLine("Enter a word: ");
		return word;
	}
}
