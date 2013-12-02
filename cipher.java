import acm.program.*;

public class cipher extends ConsoleProgram{
	
	private String encryptCaesar(String str, int key){
		String result = "";
		
		return result;
	}
	
	public void run(){
		println("This program is a Ceasar Cipher program");
		int key = readInt("Enter your key:");
		String plaintext = readLine("Enter your message: ");
		String ciphertext = encryptCaesar(plaintext, key);
		println("Encrypted message is:" + ciphertext);
	}
}
