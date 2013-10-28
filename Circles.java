
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import acm.util.*;
import acm.graphics.*;

public class Circles extends ConsoleProgram {

	public void run() {
		
		for (int i = 0; i < 10; i++){
			println(rgen.nextInt(0, 200));
		}

	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
