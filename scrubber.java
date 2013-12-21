import java.awt.Color;

import acm.graphics.*;

public class scrubber extends GCompound{

	public GRect ridge;
	
	public void drawRidge(double ridgeWidth, double ridgeHeight,double x, double y){
		ridge = new GRect(ridgeWidth, ridgeHeight, x, y);
		ridge.setFilled(true);
		ridge.setColor(Color.LIGHT_GRAY);
		add(ridge);
	}
	
	
	public void drawRidges(double ridgeWidth, double ridgeHeight,double x, double y){
		
		for(int i=0; i<getHeight(); i++){
			drawRidge(ridgeWidth, ridgeHeight, x, y*i);
		}
		
	}
}
