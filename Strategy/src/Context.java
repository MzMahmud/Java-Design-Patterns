public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int sumUpto(int n) {
		return strategy.sumUpto(n);
	}
}
