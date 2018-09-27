public class AwayJersey extends Jersey{
	
	@Override
	public void show() {
		System.out.print(features);
		System.out.println("Cost = " + cost + "\n------------------");
	}
	@Override
	public void make() {
		cost = 130;
		features = "Away Jersey\n";
	}
}
