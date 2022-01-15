package project1;
public class Employee1
{
	private int empid;
	private String name;
	private int salary;
Employee1(int empid,String name)
{
	super();
	this.empid=empid;
	this.name=name;
}
Employee1(int empid,String name,int salary)
{
	super();
	this.empid=empid;
	this.name=name;
	this.salary=salary;
	
}
public int getEmpid()
{
	return empid;
}
public String getName()
{
	return name;
}
public int getSalary()
{
	return salary;
}
public void setName(String name)
{
	this.name=name;
}
public void setSalary(int salary)
{
	this.salary=salary;
	
}
void showDetails()
{
	System.out.println("name of employee:" +name);
	System.out.println("employeeid:" +empid);
	System.out.println("salary of employee:" +salary);
	System.out.println();
}
void allowance()
{
	if(salary<10000)
	{
		System.out.println("Allowance is:" +salary*0.15);
	}
	else if(salary>10000 && salary<15000)
	{
		System.out.println("Allowance is:" +salary*0.1);
	}
	else if(salary>15000)
	{
		System.out.println("Allowance is:" +salary*0.5);
	}
}

	
	

}


