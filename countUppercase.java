import acm.program.*;

public class countUppercase extends ConsoleProgram{
	
	private String keyword;
	
	public void run(){
		askWord();
		checkUpperCase(keyword);
	}
	
	public String askWord(){
		keyword = readLine("Enter your word: ");
		return keyword;
	}
	
	public void checkUpperCase(String str){
		int count = 0;
		
		for (int i = 0; i < str.length(); i++){
			char ch = keyword.charAt(i);
			if(Character.isUpperCase(ch)){
				count++;
			}
		}
		println(count);
	}

}
