public class KidMealBuilder implements Builder{
	private Meal meal;
	
	public KidMealBuilder() {
		meal = new Meal();
	}
	
	@Override
	public void addItem1() {
		meal.add("Sandwitch");
	}

	@Override
	public void addItem2() {
		meal.add("Chocolate Milk");
	}

	@Override
	public void adddrink() {
		meal.add("Orange Juice");
	}
	
	@Override
	public Meal getMeal() {
		return meal;
	}
}
