import java.util.StringTokenizer;

import acm.program.*;

public class tokenizer extends ConsoleProgram{
	
	private void printTokens(String str){
		StringTokenizer tokenizer = new StringTokenizer(str);
		
		for(int count = 0; tokenizer.hasMoreTokens(); count++){
			println("Token # " + count + ": " + tokenizer.nextToken());
		}
		
	}
	
	public void run(){
		String line = readLine("Enter some text to tokenize:");
		println("The tokens of the string are:");
		printTokens(line);
	}

}
