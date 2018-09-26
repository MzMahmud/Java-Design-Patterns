public class CloseState implements State{
	@Override
	public void buttonPush(Door door) {
		System.out.println("Button Push");
		door.setState(new OpenState());//sets to open state
	}

	@Override
	public void reset(Door door) {
		System.out.println("Reset");
		door.setState(new CloseState());//sets to close state
	}
	@Override
	public String toString() {
		return "Close\n";
	}
}
