import acm.program.*;

public class cipher extends ConsoleProgram{
	
	
	public void run(){
		println("This program is a Ceasar Cipher program");
		int key = readInt("Enter your key:");
		String plainText = readLine("Enter your message: ");
		String cipherText = encrypt(plainText, key);
		println("Encrypted message is:");
		println(cipherText);
		
	}
}
