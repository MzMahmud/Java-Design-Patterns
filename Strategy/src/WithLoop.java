public class WithLoop implements Strategy {
	public int sumUpto(int n) {
		System.out.println("With Loop");
		int res = 0;
		for(int i = 1;i <= n;i++)
			res += i;
		return res;
	}
}
