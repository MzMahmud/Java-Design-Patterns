
public class Client {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape("circle");
		shape.fill("RED");
		shape.stroke("GREEN");
		shape.draw();
		
		shape = factory.getShape("rectangle");
		shape.fill("BLUE");
		shape.stroke("GREEN");
		shape.draw();
		
		shape = factory.getShape("triangle");
		shape.fill("Orange");
		shape.stroke("GREEN");
		shape.draw();
	}
}
