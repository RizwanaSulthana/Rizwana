package employeeproject2;


	public class Employee1 {
		private int empId;
		private String name;
		private int salary;
		private char gender;
		
		
		public Employee1(int empId, String name, int salary, char gender) {
			
			this.empId = empId;
			this.name = name;
			this.salary = salary;
			this.gender = gender;
		}

		public int getEmpId() {
			return empId;
		}

		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			if(salary<this.salary)
			{
				System.out.println("salary cannot be less than existing salary");
			}
			else {
			this.salary = salary;
			}
		}

		public String getGender()
		{
			switch(gender) {
			case 'M':
				return "Male";
			case 'F':
				return "Female";
			default:
				return "unknown";
				
			}
			
			
		}

		

		
		public void display() {
			System.out.println("employee id:" +empId);
			System.out.println("Name:" + name);
			System.out.println("Salary:" + salary);
			System.out.println("Gender:" + getGender());
		
			
			
		}
		

	}





