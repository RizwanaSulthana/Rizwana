package com.thr;

public class MessageReader extends Thread {
	
	private MessageBox box;

	public MessageReader(MessageBox box) {
		super();
		this.box = box;
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			String message= box.getMessage();
			System.out.println("Received:" +message);
			
			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

}
