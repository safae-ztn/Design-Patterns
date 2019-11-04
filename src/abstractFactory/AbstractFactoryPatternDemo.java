package abstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory notColoredFact   = FactoryProducer.getFactory(false);
		Shape rect = notColoredFact.getShape("RECTANGLE");
		rect.draw();
		Shape s = notColoredFact.getShape("SQUARE");
		s.draw();
		
		// colored shapes
		AbstractFactory coloredFact   = FactoryProducer.getFactory(true);
		Shape re = coloredFact.getShape("RECTANGLE");
		re.draw();
		Shape sq = coloredFact.getShape("SQUARE");
		sq.draw();

	}

}
