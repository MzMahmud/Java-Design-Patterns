public class FaxMessageReceiver extends Receiver{

	public FaxMessageReceiver(Receiver next) {
		super(next);
	}

	@Override
	public boolean processMessage(Message m) {
		if(m.text.contains("fax")) {
			System.out.println("Fax Handling Message");
			System.out.println(m);
			return true;
		}
		if(this.nextReceiver != null)
			return nextReceiver.processMessage(m);
		
		return false;
	}
}
