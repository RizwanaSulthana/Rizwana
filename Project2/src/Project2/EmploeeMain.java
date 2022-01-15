package Project2;

public class EmploeeMain {
	public static void main(String[] args) {

		Employee e1 = new Employee(212133, "Rizwanaa");
		Employee e2 = new Employee(212134, "xyz", 2000);
		e1.showDetails();
		e2.showDetails();

		e1.setName("Rizzu");
		e1.setSalary(30000);
		e1.allowance();


		e2.setSalary(2000);
		e2.allowance();


		}



		}


