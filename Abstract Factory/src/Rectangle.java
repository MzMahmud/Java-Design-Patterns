public class Rectangle implements Shape{
	private String Fill,Stroke;
	@Override
	public void draw() {
		System.out.println("Rectangle");
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
