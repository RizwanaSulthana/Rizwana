package com.thr;

public class Main {


	public static void main(String[]args)
	{
		
		MessageBox mb=new MessageBox();
		MessageReader reader=new MessageReader(mb);
		MessageWriter writer=new MessageWriter(mb);
		
		reader.start();
		writer.start();
		
		
	}

}
