package prototypePattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadCache();
		
	    Shape clonedShape1 = (Shape) ShapeCache.getShape("id1");
	    System.out.println(" shape : " + clonedShape1.getType());
	    
	    Shape clonedShape2 = ShapeCache.getShape("id2");
	    System.out.println(" shape : "+clonedShape2.getType());
	     
	    Shape clonedShape3 = ShapeCache.getShape("id3");
	    System.out.println(" shape : "+clonedShape3.getType());

	}
}
