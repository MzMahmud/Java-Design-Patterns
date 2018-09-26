public class ShapeFactory2D implements ShapeFactory{
	public Shape getShape(String name) {
		if("circle".equalsIgnoreCase(name)) {
			return new Circle();
		}else if("rectangle".equalsIgnoreCase(name)) {
			return new Rectangle();
		}else if("triangle".equalsIgnoreCase(name)) {
			return new Triangle();
		}
		return null;
	}
}
