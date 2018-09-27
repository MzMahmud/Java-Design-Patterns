public abstract class Decorator extends Jersey{
	protected Jersey decoratedJersey;
	
	public Decorator(Jersey decoratedJersey) {
		this.decoratedJersey = decoratedJersey;
	}
	
	@Override
	public void show() {
		System.out.print(features);
		System.out.println("Cost = " + cost + "\n--------------");
	}
}
