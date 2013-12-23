import java.awt.Color;

import acm.graphics.*;

public class list extends GCompound{
	
	// Instance variables
	private GRect newRidge;
	
	
	public list(int height, int width){
		newRidge = new GRect(width, height);
		newRidge.setFilled(true);
		newRidge.setFillColor(Color.black);
		add(newRidge);
	}
	
}
