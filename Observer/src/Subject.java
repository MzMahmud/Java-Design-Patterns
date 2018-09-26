import java.util.ArrayList;

public class Subject {
	private int data;
	private ArrayList<Observer> observers;
	
	public Subject() {
		observers = new ArrayList<>();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void ditach(Observer observer) {
		observers.remove(observer);
	}
	
	public void updateValue(int n) {
		data = n;
		notifyAllObserver();
	}
	
	public int getData() {
		return data;
	}
	
	public void notifyAllObserver() {
		for(Observer o:observers) {
			o.update();
		}
	}
}
