public class DecObserver extends Observer{

	public DecObserver(Subject subject) {
		super(subject);
	}

	@Override
	public void update() {
		System.out.println("New Update in DEC");
		System.out.println(subject.getData());
	}
}
