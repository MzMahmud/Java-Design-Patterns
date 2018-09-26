public class User {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public User(String name){
      this.name  = name;
   }

   public void signUp(ChatRoom chatRoom) {
	   chatRoom.add(this);
   }
   
   public void signOut(ChatRoom chatRoom) {
	   chatRoom.remove(this);
   }
   
   public void sendMessage(ChatRoom chatRoom,String message){
      chatRoom.newMessage(this,message);
   }
}