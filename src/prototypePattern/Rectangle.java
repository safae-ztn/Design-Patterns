package prototypePattern;

public class Rectangle extends Shape {
	
	public Rectangle() {
		type="rectangle";
	}
	
	public void draw() {
		System.out.print(" this is ractangle -> draw() method ");
	}
}
