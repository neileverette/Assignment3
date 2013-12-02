import acm.program.*;

public class cipher extends ConsoleProgram{
	

	
	public void run(){
		println("This program is a Ceasar Cipher program");
		int key = readInt("Enter your key:");
		String plaintext = readLine("Enter your message: ");
		String ciphertext = encrypt(plaintext, key);
		println("Encrypted message is:" + ciphertext);
	}
}
