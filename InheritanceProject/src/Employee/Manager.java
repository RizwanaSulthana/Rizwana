package Employee;



public class Manager extends Employee{
      
	private String project;

	public Manager(int empId, String name, int salary, char gender, String project) {
		super(empId, name, salary, gender);
		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	public void display() {
		super.display();
		
	    System.out.println("project " +project);
	}
	
	
}
