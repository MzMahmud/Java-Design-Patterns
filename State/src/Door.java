public class Door {
	private State state;//tracks change of state
	
	public Door() {
		state = new CloseState();//initial state is closed
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public void buttonPush() {
		state.buttonPush(this);
		System.out.println(this);
	}

	public void reset() {
		state.reset(this);
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return state.toString();
	}
}
