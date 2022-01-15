package com.thr;

public class MessageWriter extends Thread{
	
	private MessageBox box;

	public MessageWriter(MessageBox box) {
		super();
		this.box = box;
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			box.storeMessage("Message " +i);
			
			System.out.println("stored " + "message :" +i);
			
			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
