package com.thr;

public class MessageBox {
	
	private String message;
	
	synchronized public void storeMessage(String m)
	{
		if(message!=null)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.message=m;
		notify();
	}
	synchronized String getMessage()
	{
		if(this.message==null)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String msg=this.message;
		this.message=null;
		notify();
		return msg;
		}

}
