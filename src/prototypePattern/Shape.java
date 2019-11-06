package prototypePattern;

public abstract class Shape implements Cloneable{
	
	private String id;
	protected String type;
	
	abstract void draw();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Object clone() {
		Object clon=null;
		
		try {
			clon =super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clon;
	}
}
