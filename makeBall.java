import java.awt.Color;
import acm.graphics.*;

public class makeBall extends GCompound{
	
	private GOval newCircle;
	
	public makeBall (String name, double r){
		newCircle = new GOval(r, r);
		
		GLabel label = new GLabel("name");
		label.setFont("Helvetica-20");
		label.setColor(Color.WHITE);
	
		add(newCircle);
		add(label, newCircle.getWidth()/2 - label.getWidth()/2, newCircle.getHeight()/2 + label.getHeight()/3);
	}

}
