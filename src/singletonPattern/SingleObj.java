package singletonPattern;

public class SingleObj {
	
	private static SingleObj instance = new SingleObj();
	
	private SingleObj() {
		
	}
	
	public static SingleObj getInstance() {
		return instance;
	}
	
	public void print() {
		
		System.out.println("Hello Object");
	}

}
