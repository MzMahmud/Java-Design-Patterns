
public class Demo {
	public static void main(String[] args) {
		Door door = new Door();
		System.out.println(door);
		door.buttonPush();
		door.buttonPush();
		door.reset();
		door.buttonPush();
		door.reset();
		door.buttonPush();
		door.buttonPush();
	}
}
