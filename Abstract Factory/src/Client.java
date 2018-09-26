
public class Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();
		
		ShapeFactory factory = abstractFactory.getFactory("2D");
		
		Shape shape;
		shape = factory.getShape("circle");
		shape.fill("red");
		shape.stroke("green");
		shape.draw();
		
		factory = abstractFactory.getFactory("3D");
		shape = factory.getShape("cylinder");
		shape.fill("red");
		shape.stroke("green");
		shape.draw();
	}
}
