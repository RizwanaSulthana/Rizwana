package Employee;



public class Director extends Employee{
	private String client;
	private float stockHolding;
	public Director(int empId, String name, int salary, char gender, String client, float stockHolder) {
		super(empId, name, salary, gender);
		this.client = client;
		this.stockHolding = stockHolder;
				
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public float getStockHolder() {
		return stockHolding;
	}
	public void setStockHolder(float stockHolder) {
		this.stockHolding = stockHolder;
	}
	public void display() {
		super.display();
		System.out.println("client:" +client);
		System.out.println("stockHolder:" +stockHolding);
		
	}

	
}
