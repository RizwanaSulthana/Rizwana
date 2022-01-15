package employeeproject2;

public class Department {
	private int deptId;
	private String deptName;
	private String place;
	public Department(int deptId, String deptName, String place) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.place = place;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void display() {
		
		System.out.println("deptId :" +deptId);
		System.out.println("deptName :" +deptName);
		System.out.println("place :" + place);
		// TODO Auto-generated method stub
		
	}
	
	
	
}

	
