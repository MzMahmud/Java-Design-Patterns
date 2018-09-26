public class HexObserver extends Observer{

	public HexObserver(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("New Update in HEX");
		System.out.println(Integer.toHexString(subject.getData()));
	}
}
