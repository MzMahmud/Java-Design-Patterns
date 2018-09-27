public class GreenBorderDecorator extends Decorator{
	public GreenBorderDecorator(Shape shape) {
		super(shape);		
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		addFill();
	}
	
	public void addFill() {
		System.out.println("Shape Bordered with GREEN");
	}
}
