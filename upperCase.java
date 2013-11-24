import acm.program.*;

public class upperCase extends ConsoleProgram{
	
	private String keyword;

	public void run(){
		
		askWord();
		printUppercase(keyword);
		//reverseWord();
	
	}
	
	private String askWord(){
		String keyword = readLine("Enter a word: ");
		//printUppercase(keyword);
		return keyword;
	}
	
	private void printUppercase(String keyword){
		String result = "";
		
		for(int i = 0; i < keyword.length(); i++){
			char ch = keyword.charAt(i);
			result += Character.toUpperCase(ch);
		}
		println(result);	
	}

}
