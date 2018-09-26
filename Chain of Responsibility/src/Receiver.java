public abstract class Receiver {
	protected Receiver nextReceiver;
	
	public Receiver(Receiver next) {
		nextReceiver = next;
	}
	public abstract boolean processMessage(Message m); 
}
