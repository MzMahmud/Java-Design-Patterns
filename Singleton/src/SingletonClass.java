public class SingletonClass {
	private String data;
	private static SingletonClass instance;

	private SingletonClass(String data) {
		this.data = data;
	}
	
	public static SingletonClass getInstance() {
		if(instance == null)
			instance = new SingletonClass("");
		return instance;
	}
	
	public static SingletonClass getInstance(String data) {
		if(instance == null)
			instance = new SingletonClass(data);
		return instance;
	}
	
	@Override
	public String toString() {
		return "Data :: " + data + "\n" + "Hash :: " + this.hashCode() + "\n";
	}
}

