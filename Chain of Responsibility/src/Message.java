public class Message {
	public String text;
	private String priroty;
	public Message(String a,String b) {
		text = a;
		priroty = b;
	}
	
	@Override
	public String toString() {
		return "Priority :: " + priroty + "\nMessage ::\n" + text + "\n";
	}
}
