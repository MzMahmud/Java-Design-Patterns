public class AdvancedCalculator implements AdvanceOperation{
	Adapter adapter;
	
	public AdvancedCalculator() {
		adapter = new Adapter();
	}

	@Override
	public int add(int a, int b) {
		return adapter.add(a, b);
	}

	@Override
	public int sub(int a, int b) {
		return adapter.sub(a, b);
	}

	@Override
	public int mul(int a, int b) {
		return adapter.mul(a, b);
	}
}
