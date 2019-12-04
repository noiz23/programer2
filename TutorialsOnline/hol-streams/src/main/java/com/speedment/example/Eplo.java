package com.speedment.example;

import java.util.function.Supplier;

public class Eplo {
	private boolean b1;
	private Boolean b2;
	
	public boolean isB1() {
		return b1;
	}
	public void setB1(boolean b1) {
		this.b1 = b1;
	}
	public Boolean getB2() {
		return b2;
	}
	public void setB2(Boolean b2) {
		this.b2 = b2;
	}
	

	private int start = 0;
	 
	Supplier<Integer> incrementer() {
	    return () -> start++;
	}
}
