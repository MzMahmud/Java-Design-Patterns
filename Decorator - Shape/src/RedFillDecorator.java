public class RedFillDecorator extends Decorator{
	public RedFillDecorator(Shape shape) {
		super(shape);		
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		addFill();
	}
	
	public void addFill() {
		System.out.println("Shape Filled with RED");
	}
}
