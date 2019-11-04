package abstractFactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String typeShape) {
		// TODO Auto-generated method stub
		if(typeShape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}else if(typeShape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
	
}
