public class Demo {
	public static void main(String[] args) {
		FaxMessageReceiver fax = new FaxMessageReceiver(null);
		PhoneMessageReceiver phone = new PhoneMessageReceiver(fax);
		EmailMessageReceiver mail = new EmailMessageReceiver(phone);
		
		IssueRaiser issueRaiser = new IssueRaiser(mail);
		//the chain IssueRaiser->Email->Phone->Fax->null
		
		
		Message forEmail = new Message("this is for email", "Medium");
		issueRaiser.raiseIssue(forEmail);
		
		Message forFax = new Message("this is for fax", "High");
		issueRaiser.raiseIssue(forFax);
		
		Message forPhone = new Message("this is for phone", "Low");
		issueRaiser.raiseIssue(forPhone);
	}
}
