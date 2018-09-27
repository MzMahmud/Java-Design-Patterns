public class NumberDecorator extends Decorator{
	private String number;
	public NumberDecorator(Jersey jersey,String number) {
		super(jersey);
		this.number = number;
	}
	
	@Override
	public void make() {
		decoratedJersey.make();		
		addNumber(number);
	}
	private void addNumber(String number) {
		this.cost = decoratedJersey.cost + (number.length()*10);
		this.features = decoratedJersey.features + "Number = " + number + "\n";
	}
}
