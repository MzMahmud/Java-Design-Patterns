public class MediatorPatternDemo {
   public static void main(String[] args) {
      ChatRoom chatRoom = new ChatRoom();
      
	  User robert = new User("Robert");
      User john = new User("John");

      robert.signUp(chatRoom);
      john.signUp(chatRoom);
      
      robert.sendMessage(chatRoom,"Hi! John!");
      System.out.println(chatRoom + "\n");
      
      john.sendMessage(chatRoom,"Hello! Robert!");
      System.out.println(chatRoom + "\n");
   }
}