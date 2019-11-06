package prototypePattern;

import java.util.HashMap;

public class ShapeCache {
	
	private static HashMap<String , Shape> hashmap = new HashMap<String, Shape>();
	
	public static Shape getShape(String id) {
		Shape cashedShape = hashmap.get(id);
		return (Shape) cashedShape.clone();
	}
	
	public static void loadCache() {
		
		Cercle cercle = new Cercle();
		cercle.setId("id1");
		hashmap.put(cercle.getId(), cercle);
		
		Rectangle rec = new Rectangle();
		rec.setId("id2");
		hashmap.put(rec.getId(), rec);
		
		Square s = new Square();
		s.setId("id3");
		hashmap.put(s.getId(), s);
		
	}
}
