package FactoryPattern;

public class FactoryDemo {

	public static void main(String[] args) {
		
		FactoryShape factoryShape = new FactoryShape();
		
		//obj of cercle
		Shape cercle = factoryShape.getTypeShape("CERCLE");;
		cercle.draw();
		
		//obj of rectangle 
		Shape rec = factoryShape.getTypeShape("RECTANGLE");
		rec.draw();
		
		//obj of square
		Shape sq = factoryShape.getTypeShape("SQUARE");
		sq.draw();

	}

}
