package abstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean colored) {
		if(colored) {
			return new ColoredShapeFactory();
		}else {
			return new ShapeFactory();
		}
	}
}
