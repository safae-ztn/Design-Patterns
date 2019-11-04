package abstractFactory;

public class ColoredShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String typeShape) {
		// TODO Auto-generated method stub
		if(typeShape.equals("RECTANGLE")) {
			return new ColoredRectangle();
		}else if(typeShape.equalsIgnoreCase("SQUARE")) {
			return new ColoredSquare();
		}
		return null;
	}
	
}
