public class Client {
	public static void main(String[] args) {
		Director director = new Director(new KidMealBuilder());
		
		director.construct();
		Meal meal = director.getMeal();
		
		meal.show();
	}
}
