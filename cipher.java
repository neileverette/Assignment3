import acm.program.*;

public class cipher extends ConsoleProgram{
	
	private char encryptChar(char ch, int key){
		if (Character.isUpperCase(ch)){
		return ((char)('A' + ((ch - 'A' + key) % 26)));
		}
		return ch;
	}
	
	private String encryptCaesar(String str, int key){
		String result = "";
		
		for(int i = 0; i < str.length(); i++){
			char ch = Character.toUpperCase(str.charAt(i));
			result += encryptChar(ch, key);
		}
		
		return result;
	}
	
	public void run(){
		println("This program is a Ceasar Cipher program");
		int key = readInt("Enter your key:");
		String plaintext = readLine("Enter your message: ");
		String ciphertext = encryptCaesar(plaintext, key);
		println("Encrypted message is: " + ciphertext);
	}
}
