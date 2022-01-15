package genericproject;

public class GenericStore <T> {
	
	private T data;

	public GenericStore(T data) {
		super();
		this.data = data;
	}
	
	public void save(T s)
	{
		this.data=s;
	}
	public T getData() {
		return data;
		
	}
}


