package builderPattern;

public class MealBuilder {
	
	public Meal prepareMeal1() {
		
		Meal meal1 = new Meal();
		meal1.addItem(new VegBurger());
		meal1.addItem(new Coke());
		return meal1;
	}
	
    public Meal prepareMeal2() {
		
		Meal meal2 = new Meal();
		meal2.addItem(new ChickenBurger());
		meal2.addItem(new Pepsi());
		return meal2;
	}

}
