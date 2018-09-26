public abstract class Observer {
	protected Subject subject;
	
	public Observer(Subject subject) {
		this.subject = subject;
		this.subscribe(subject);
	}
	
	public void subscribe(Subject subject) {
		subject.attach(this);
	}
	public void Unsubscribe(Subject subject) {
		subject.ditach(this);
	}
	
	public abstract void update();
}
