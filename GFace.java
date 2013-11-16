
import acm.graphics.*; 
 
public class GFace extends GCompound { 
 

 public GFace(double width, double height) { 
	 head = new GOval(width, height); 
	 add(head, 0, 0); 
 }
 
 /* Private instance variables */ 
 private GOval head; 

} 