
public class Demo {
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		System.out.println('\n');
		
		Shape redFilledCircle = new RedFillDecorator(new Circle());
		redFilledCircle.draw();
		System.out.println('\n');
		
		Shape greenBorderedCircle = new GreenBorderDecorator(new Circle());
		greenBorderedCircle.draw();
		System.out.println('\n');
		
		Shape filledBorderedCircle = new RedFillDecorator(new GreenBorderDecorator(new Circle()));
		filledBorderedCircle.draw();
		System.out.println('\n');
		
		Shape BorderedfilledCircle = new GreenBorderDecorator(new RedFillDecorator(new Circle()));
		BorderedfilledCircle.draw();
		System.out.println('\n');
	}
}
