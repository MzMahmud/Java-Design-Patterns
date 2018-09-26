public class BinObserver extends Observer{

	public BinObserver(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("New Update in BIN");
		System.out.println(Integer.toBinaryString(subject.getData()));
	}
}
