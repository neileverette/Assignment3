import acm.program.*;

public class upperCase extends ConsoleProgram{
	
	private String keyword;

	public void run(){
		
		askWord();
		upperCase(keyword);

	}
	
	private String askWord(){
		keyword = readLine("Enter a word: ");
		return keyword;
	}
	
	private void upperCase(String keyword){
		String result = "";
		
		for(int i = 0; i < keyword.length(); i++){
			char ch = keyword.charAt(i);
			result += Character.toUpperCase(ch);
		}
		println(result);	
	}

}
