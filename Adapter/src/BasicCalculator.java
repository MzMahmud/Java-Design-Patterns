public class BasicCalculator implements BasicOperation{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	@Override
	public int neg(int a) {
		return -a;
	}
}
