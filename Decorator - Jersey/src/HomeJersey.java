public class HomeJersey extends Jersey{
	
	@Override
	public void show() {
		System.out.print(features);
		System.out.println("Cost = " + cost + "\n------------------");
	}
	@Override
	public void make() {
		cost = 150;
		features = "Home Jersey\n";
	}
}
