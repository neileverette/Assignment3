import java.awt.Color;

import acm.graphics.*;

public class list extends GCompound{
	
	// Instance variables
	private GRect newRidge;
	
	
	public list(){
		newRidge = new GRect(300, 100);
		newRidge.setFilled(true);
		newRidge.setFillColor(Color.black);
		add(newRidge);
	}
	
}
