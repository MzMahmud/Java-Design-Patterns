
public class Client {
	public static void main(String[] args) {
		int ans;
		
		Context loop = new Context(new WithLoop());
		ans = loop.sumUpto(10);
		System.out.println(ans);
		
		Context form = new Context(new WithFormula());
		ans = form.sumUpto(10);
		System.out.println(ans);
		
	}
}
