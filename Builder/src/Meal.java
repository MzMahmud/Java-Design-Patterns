import java.util.ArrayList;

public class Meal {
	private ArrayList<String> items;
	public Meal() {
		items = new ArrayList<>();
	}
	public void add(String s) {
		items.add(s);
	}
	public void show() {
		System.out.println("::Items::");
		for(String s:items) {
			System.out.println(s);
		}
	}
}
