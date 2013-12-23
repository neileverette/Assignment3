import java.awt.Color;

import acm.graphics.*;

public class list extends GCompound{
	
	// Instance variables
	private GRect newRidge;
	
	public list(int height, int width, int gap, Color color, int listNumber){
		
		for (int i=0; i<listNumber; i++){
			newRidge = new GRect(0, i*10, width, height);
			newRidge.setFilled(true);
			newRidge.setFillColor(color);
			add(newRidge);
		}
		
	}
	
}
