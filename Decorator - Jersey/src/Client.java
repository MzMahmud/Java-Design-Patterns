public class Client {
	public static void main(String[] args) {
		
		//all cases for home jersey
		Jersey homeJersey = new HomeJersey();
		homeJersey.make();
		homeJersey.show();
		
		Jersey withNumber = new NumberDecorator(new HomeJersey(),"064");
		withNumber.make();
		withNumber.show();
		
		Jersey withName = new NameDecorator(new HomeJersey(),"MoaZ");
		withName.make();
		withName.show();
		
		Jersey NameNumber = new NameDecorator( new NumberDecorator( new HomeJersey() , "064" ) , "Moaz");
		NameNumber.make();
		NameNumber.show();
		
		Jersey NumberName = new NumberDecorator( new NameDecorator( new HomeJersey() , "MoaZ" ) , "064");
		NumberName.make();
		NumberName.show();
		
		//all cases for away jersey
		Jersey awayJersey = new AwayJersey();
		awayJersey.make();
		awayJersey.show();
		
		withNumber = new NumberDecorator(new AwayJersey(),"064");
		withNumber.make();
		withNumber.show();
		
		withName = new NameDecorator(new AwayJersey(),"MoaZ");
		withName.make();
		withName.show();
		
		NameNumber = new NameDecorator( new NumberDecorator( new AwayJersey() , "064" ) , "Moaz");
		NameNumber.make();
		NameNumber.show();
		
		NumberName = new NumberDecorator( new NameDecorator( new AwayJersey() , "MoaZ" ) , "064");
		NumberName.make();
		NumberName.show();
	}
}
