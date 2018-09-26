public class PhoneMessageReceiver extends Receiver{

	public PhoneMessageReceiver(Receiver next) {
		super(next);
	}

	@Override
	public boolean processMessage(Message m) {
		if(m.text.contains("phone")) {
			System.out.println("Phone Handling Message");
			System.out.println(m);
			return true;
		}
		return nextReceiver.processMessage(m);
	}

}
