import acm.program.*;

public class checkPalindrome extends ConsoleProgram{
	
	private String keyword;
	
	public void run(){
		
		boolean loop = true;
		
		while(loop){
			askKeyword();
			checkWord(keyword);
		}
	}
	
	private String askKeyword(){
		keyword = readLine("Enter your word : ");
		return keyword;
	}
	
	private boolean checkWord(String keyword){
		
		for (int i = 0; i < keyword.length()/2; i++){
			if (keyword.charAt(i) != keyword.charAt(keyword.length()-(i+1))){
				println("Not a palindrone");
				return false;
			}
		}
		println("Is a palindrone");
		return true;
	}
	
}
