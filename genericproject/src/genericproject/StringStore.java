package genericproject;

public class StringStore {
        
	private String data;

	public StringStore(String data) {
		super();
		this.data = data;
	}
	
	public void save(String s)
	{
		this.data=s;
	}
	public String getData() {
		return data;
		
	}
}
