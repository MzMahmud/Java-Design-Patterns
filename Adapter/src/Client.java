public class Client {
	public static void main(String[] args) {
		AdvancedCalculator cal = new AdvancedCalculator();
		int ans;
		
		ans = cal.add(10, -6);
		System.out.println(ans);
		
		ans = cal.sub(10, -6);
		System.out.println(ans);
		
		ans = cal.mul(10,-6);
		System.out.println(ans);
	}
}
