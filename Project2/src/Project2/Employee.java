package Project2;

public class Employee {
	private int empid;
	private String name;
	private int salary;

	public Employee(int empid, String name) {
	super();
	this.empid = empid;
	this.name = name;
	//salary = 20000;
	}
	public Employee(int empid, String name, int salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	}
	public int getEmpid() {
	return empid;
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
	this.salary = salary;
	}

	void showDetails()
	{
	System.out.println();
	System.out.println("Name " +name);
	System.out.println("Employee ID " +empid);
	System.out.println("Salary " +salary);
	}



	void allowance()
	{
	if(salary<10000)
	System.out.println("Allowance "+salary*0.15);
	else if(salary>10000 && salary<15000)
	System.out.println("Allowance "+salary*0.1);
	else if(salary>15000)
	System.out.println("Allowance "+salary*0.5);


	}



	}

