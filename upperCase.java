import acm.program.*;

public class upperCase extends ConsoleProgram{

	public void run(){

		askWord();

//	
	}
	
	public String askWord(){
		String keyword = readLine("Enter a word: ");
		printUppercase(keyword);
		return keyword;
	}
	
	private void printUppercase(String keyword){
		println(keyword);
	}

}
