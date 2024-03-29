import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class createBall extends GCompound {
	
	public createBall(double r){
		newCircle = new GOval(r, r);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.GREEN);
		
		GLabel label = new GLabel("A");
		label.setFont("Helvetica-20");
		label.setColor(Color.BLACK);
	
		add(newCircle);
		add(label, newCircle.getWidth()/2 - label.getWidth()/2, newCircle.getHeight()/2 + label.getHeight()/3);
	}

	public createBall(){
		newCircle = new GOval(30, 30);
		newCircle.setFilled(true);
		newCircle.setFillColor(Color.CYAN);
		add(newCircle);
	}
	
	public createBall(double x, double y, double r, Color color){
		newCircle = new GOval(x,y,r, r);
		newCircle.setFilled(true);
		newCircle.setFillColor(color);
		add(newCircle);
	}
	private GOval newCircle;
	
}

