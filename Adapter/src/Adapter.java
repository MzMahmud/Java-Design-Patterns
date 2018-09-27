public class Adapter implements AdvanceOperation{
	BasicOperation basicCalculator;
	
	public Adapter() {
		basicCalculator = new BasicCalculator();
	}
	
	@Override
	public int add(int a, int b) {
		return basicCalculator.add(a, b);
	}

	@Override
	public int sub(int a, int b) {
		return basicCalculator.add(a, basicCalculator.neg(b));
	}

	@Override
	public int mul(int a, int b) {
		int x = a < 0?-a:a;
		int ans = 0;
		for(int i = 1;i <= x;i++) {
			ans += b;
		}
		return (a < 0?-ans:ans);
	}
}
