public class AbstractFactory {
	public ShapeFactory getFactory(String name) {
		if("2d".equalsIgnoreCase(name)) {
			return new ShapeFactory2D();
		}else if("3d".equalsIgnoreCase(name)) {
			return new ShapeFactory3D();
		}
		return null;
	}
}
