public class WithFormula implements Strategy{
	@Override
	public int sumUpto(int n) {
		System.out.println("With Formula");
		return (n*(n+1))/2;
	}
}
