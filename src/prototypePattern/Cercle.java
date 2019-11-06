package prototypePattern;

public class Cercle extends Shape {

	@Override
	void draw() {
		System.out.print(" this is cercle -> draw() method ");
	}
	
	public Cercle() {
		type="cercle";
	}
}
