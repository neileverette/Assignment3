import acm.program.*;

public class upperCase extends ConsoleProgram{
	
	private String keyword = "bob";

	public void run(){
		
		askWord();
		println(keyword);

	}
	
	private String askWord(){
		String keyword = readLine("Enter a word: ");
		return keyword;
	}
	
	private void printWord(String keyword){
		println(keyword);
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
