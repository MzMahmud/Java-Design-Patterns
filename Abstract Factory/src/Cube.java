public class Cube implements Shape{
	private String Fill,Stroke;
	@Override
	public void draw() {
		System.out.println("Cube");
		System.out.println("fill = " + Fill);
		System.out.println("stroke = " + Stroke);
	}

	@Override
	public void fill(String color) {
		Fill = color;
	}

	@Override
	public void stroke(String color) {
		Stroke = color;
	}
}
