import acm.program.*;

public class replaceOccurance extends ConsoleProgram{
	
	private String replaceFirstOccurance(String str, String orig, String repl){
		int index = str.indexOf(orig);
		
		if(index != -1){
			str = str.substring(0, index);
		}
		
	return str;
	}

}
