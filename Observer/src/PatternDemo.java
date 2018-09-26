
public class PatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();
		new BinObserver(subject);
		new HexObserver(subject);
		new DecObserver(subject);
		
		System.out.println("1st Update = 10");
		subject.updateValue(10);
		
		System.out.println("2nd Update = 7");
		subject.updateValue(7);
		
		System.out.println("3rd Update = 21");
		subject.updateValue(21);
	}
}
