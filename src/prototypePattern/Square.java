package prototypePattern;

public class Square extends Shape {

	@Override
	void draw() {
		System.out.print("this is Square -> draw() method ");
	}
	
	public Square() {
		type="square";
	}

}
