package com.threadsmain;

import com.threads.NumberThread;
import com.threads.StringThread;

public class ThreadMain {

	public static void main(String[] args) {
		
		StringThread st=new StringThread();
		NumberThread nt=new NumberThread();
		
		nt.start();
		st.start();

	}

}
