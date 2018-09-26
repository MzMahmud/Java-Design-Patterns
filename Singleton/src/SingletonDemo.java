public class SingletonDemo {
	public static void main(String[] args) {
		SingletonClass one = SingletonClass.getInstance("Moaz");
		System.out.println("ONE = \n" + one);
		
		SingletonClass two = SingletonClass.getInstance("Tanvir");
		System.out.println("TWO = \n" + two);
		
		SingletonClass three = SingletonClass.getInstance("Mita");
		System.out.println("THREE = \n" + three);
	}
}
