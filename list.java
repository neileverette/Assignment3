import java.awt.Color;

import acm.graphics.*;

public class list extends GCompound{
	
	// Instance variables
	private GRect newRidge;
	
	public list(int height, int width, Color color, int listNumber){
		
		for (int i=0; i<listNumber; i++){
			newRidge = new GRect(width, height);
			newRidge.setFilled(true);
			newRidge.setFillColor(color);
			add(newRidge);
		}
		
	}
	
}
