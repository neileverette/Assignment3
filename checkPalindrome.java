import acm.program.*;

public class checkPalindrome extends ConsoleProgram{
	
	private String keyword;
	
	public void run(){
		askKeyword();
		checkWord(keyword);
		answer();
	}
	
	private String askKeyword(){
		keyword = readLine("Enter your word : ");
		return keyword;
	}
	
	private boolean checkWord(String keyword){
		
		for (int i = 0; i < keyword.length()/2; i++){
			if (keyword.charAt(i) != keyword.length() - (i +1)){
				return false;
			}
		}
		return true;
	}
	
	private void answer(){
		if (checkWord()){
			println("yes");
		}else {
			println("no");
		}
	}
}
