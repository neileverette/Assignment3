import acm.graphics.*;

public class scrubber extends GCompound{

	public GRect ridge;
	
	public void drawRidge(double x, double y, double ridgeWidth, double ridgeHeight){
		ridge = new GRect(x,y, ridgeWidth, ridgeHeight);
		add(ridge);
	}
	
}
