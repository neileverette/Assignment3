/* 
 * File: MouseTracker.java 
 * ----------------------- 
 * This program displays the (x, y) location of the mouse. 
 */ 
 
import acm.program.*; 
import acm.graphics.*; 
import java.awt.event.*; 
 
public class MouseTracker extends GraphicsProgram { 
 
 public void run() { 
 label = new GLabel(""); 
 label.setFont("Times New Roman-36"); 
 add(label, 50, 50); 
 
 circle = new GOval(10,10, 30, 30);
 circle.setFilled(true);
 add(circle);
 
 
 // Must call this method to be able to get mouse events 
 addMouseListeners(); 
 } 
 
 // This method is called everytime user moves mouse 
 public void mouseMoved(MouseEvent e) { 
 label.setLabel("Mouse: (" + e.getX() + ", " + e.getY() + ")"); 
 //label.setLocation(e.getX()-label.getWidth()/2, e.getY());
 } 
 
 public void circleMoved(MouseEvent e){
	 circle.setLocation(e.getX(), e.getY());
 }
 
 /* Private instance variable */ 
 private GLabel label; 
 
 private GOval circle;

} 
