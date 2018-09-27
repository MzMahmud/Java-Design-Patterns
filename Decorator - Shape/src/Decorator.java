public abstract class Decorator implements Shape{
	protected Shape decoratedShape;
	
	public Decorator(Shape shape) {
		decoratedShape = shape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}

}
