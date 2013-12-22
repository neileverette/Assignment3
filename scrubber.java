import java.awt.Color;

import acm.graphics.*;

public class scrubber extends GCompound{

	// Static Variables
	private static final int RIDGEHEIGHT = 2;
	private static final int RIDGEGAP = 4;
	
	// Instance Variables
	private GRect ridge;
	
	public void createRidge(int y){
		ridge = new GRect(getWidth()-this.getWidth()/2,y,getWidth()/2, RIDGEHEIGHT);
		ridge.setFilled(true);
		add(ridge);
	}
	
	public void createRidges(){
		for(int i=0; i<getHeight()/(RIDGEHEIGHT + RIDGEGAP);i++){
			createRidge(i*(RIDGEHEIGHT+RIDGEGAP));
		}
	}
}
