
import acm.program.*; 
import acm.graphics.*; 
 
public class DrawFace extends GraphicsProgram { 
 
 /** Width of face */ 
 private static final int FACE_WIDTH = 100; 
 
 /** Height of face */ 
 private static final int FACE_HEIGHT = 200; 
 
 public void run() { 
	 GFace face = new GFace(30, 30); 
	 add(face, 100, 200); 
 } 
}