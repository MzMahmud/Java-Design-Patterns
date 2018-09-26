public class IssueRaiser {
	private Receiver firstReceiver;
	public IssueRaiser(Receiver i) {
		firstReceiver = i;
	}
	
	public void raiseIssue(Message m) {
		if(firstReceiver != null)
			firstReceiver.processMessage(m);
	}
}
