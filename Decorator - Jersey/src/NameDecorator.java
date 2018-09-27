public class NameDecorator extends Decorator{
	private String name;
	public NameDecorator(Jersey jersey,String name) {
		super(jersey);
		this.name = name;
	}
	
	@Override
	public void make() {
		decoratedJersey.make();		
		addNumber(name);
	}
	private void addNumber(String name) {
		this.cost = decoratedJersey.cost + (name.length()*5);
		this.features = decoratedJersey.features + "Name = " + name + "\n";
	}
}
