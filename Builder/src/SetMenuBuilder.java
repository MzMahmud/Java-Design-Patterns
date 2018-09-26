public class SetMenuBuilder implements Builder{
	private Meal meal;
	
	public SetMenuBuilder() {
		meal = new Meal();
	}
	
	@Override
	public void addItem1() {
		meal.add("Fried Rice");
	}

	@Override
	public void addItem2() {
		meal.add("BBQ Chicken");
	}

	@Override
	public void adddrink() {
		meal.add("Coke");
	}

	@Override
	public Meal getMeal() {
		return meal;
	}
}
