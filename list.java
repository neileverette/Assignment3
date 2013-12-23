import java.awt.Color;

import acm.graphics.*;

public class list extends GCompound{
	
	// Instance variables
	private GRect newRidge;
	
	
	public list(int height){
		newRidge = new GRect(300, height);
		newRidge.setFilled(true);
		newRidge.setFillColor(Color.black);
		add(newRidge);
	}
	
}
