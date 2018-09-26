public class ShapeFactory3D implements ShapeFactory{
	public Shape getShape(String name) {
		if("cube".equalsIgnoreCase(name)) {
			return new Cube();
		}else if("cylinder".equalsIgnoreCase(name)) {
			return new Cylinder();
		}
		return null;
	}
}
