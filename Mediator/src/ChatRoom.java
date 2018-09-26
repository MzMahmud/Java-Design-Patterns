import java.util.ArrayList;
import java.util.Date;

public class ChatRoom {
	private ArrayList<User> users;
	private String chatHistory;
	
	public ChatRoom() {
		users = new ArrayList<>();
		chatHistory = "";
	}
	
	public void newMessage(User user, String message){
		chatHistory += (new Date().toString()) + " [" + user.getName() + "] : " + message + "\n";
	}
	
	@Override
	public String toString() {
		return chatHistory;
	}

	public void add(User user) {
		chatHistory = user.getName() + " just joined!\n" + chatHistory;
		users.add(user);
	}

	public void remove(User user) {
		chatHistory = user.getName() + " just left!\n" + chatHistory;
		users.remove(user);
	}
}