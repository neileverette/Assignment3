import acm.program.*;

public class upperCase extends ConsoleProgram{
	
	private String keyword;

	public void run(){
		
		askWord();
		makeUpperCase(keyword);
		reverseLetters(keyword);

	}
	
	private String askWord(){
		keyword = readLine("Enter a word: ");
		return keyword;
	}
	
	private void makeUpperCase(String keyword){
		String result = "";
		
		for(int i = 0; i < keyword.length(); i++){
			char ch = keyword.charAt(i);
			result += Character.toUpperCase(ch);
		}
		println(result);	
	}
	
	private void reverseLetters(String keyword){
		String result = "";
		
		for(int i = keyword.length(); i > 0; i--){
			char ch = keyword.charAt(i);
			result += result + ch;
			println(result);
		}
		
	}

}
