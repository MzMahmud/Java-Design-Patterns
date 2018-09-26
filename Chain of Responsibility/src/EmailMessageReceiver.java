public class EmailMessageReceiver extends Receiver{

	public EmailMessageReceiver(Receiver next) {
		super(next);
	}

	@Override
	public boolean processMessage(Message m) {
		if(m.text.contains("email")) {
			System.out.println("Email Handling Message");
			System.out.println(m);
			return true;
		}
		return nextReceiver.processMessage(m);
	}

}
