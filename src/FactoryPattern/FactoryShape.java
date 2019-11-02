package FactoryPattern;

public class FactoryShape {
	
	public Shape getTypeShape(String type) {
		
		if(type.equalsIgnoreCase("CERCLE")) {
			return new Cercle();
		}else if(type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(type.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else {
			return null;
		}
	}

}
