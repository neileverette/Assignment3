import java.awt.Color;

import acm.graphics.*;

public class list extends GCompound{
	
	// Instance variables
	private GRect newRidge;
	
	public void list(){
		newRidge = new GRect(0,50,300, 100);
		newRidge.setFilled(true);
		newRidge.setFillColor(Color.black);
	}

}
