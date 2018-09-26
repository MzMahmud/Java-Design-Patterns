public class OpenState implements State{
	@Override
	public void buttonPush(Door door) {
		System.out.println("Button Push");
		door.setState(new CloseState());//sets state to close state
	}

	@Override
	public void reset(Door door) {
		System.out.println("Reset");
		door.setState(new CloseState());//set state to close state
	}
	@Override
	public String toString() {
		return "Open\n";
	}
}
