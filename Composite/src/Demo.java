public class Demo {
	public static void main(String[] args) {
		Employee CEO = new Employee("Sherlock", "CEO", 100000);
		
		Employee headSales = new Employee("John", "Sales", 80000);
		Employee headMarketing = new Employee("Moly", "Marketing", 80000);
		
		Employee salesExecutive1 = new Employee("Greg", "Sales", 60000);
		Employee salesExecutive2 = new Employee("Anderson", "Sales", 60000);
		Employee salesExecutive3 = new Employee("TheWoman", "Sales", 60000);
		
		Employee clerk1 = new Employee("Donavon", "Marketing", 55000);
		Employee clerk2 = new Employee("Wiggy", "Marketing", 55000);
		
		
		//build tree
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		headSales.add(salesExecutive3);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		System.out.println(CEO + "\n");
		for(Employee headEmployee: CEO.getSubordinates()) {
			System.out.println(headEmployee);
			
			for(Employee employee: headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
			System.out.println("");
		}
	}
}
