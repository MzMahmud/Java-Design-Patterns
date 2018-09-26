public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;		
	}
	
	public void construct() {
		builder.addItem1();
		builder.addItem2();
		builder.adddrink();
	}
	
	public Meal getMeal() {
		return builder.getMeal();
	}
}
