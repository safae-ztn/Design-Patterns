package builderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MealBuilder builder = new MealBuilder();
		
        Meal meal1 = builder.prepareMeal1();
        System.out.println(" praparing meal N:1");
        meal1.showItems();
		System.out.println(" the cost for this meal is : "+ meal1.getCost());
        
        Meal meal2 = builder.prepareMeal2();
		System.out.println(" preparing meal N:2");
		meal2.showItems();
		System.out.println(" the cost for this meal is : "+ meal2.getCost());

	}

}
