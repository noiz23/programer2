package com.speedment.example;

import java.util.Random;
import java.util.stream.IntStream;

public class Eplo2 {

	public static void main(String[] args) {
		new Eplo2().workaroundMultithreading();

	}
	
	public void workaroundMultithreading() {
	    int[] holder = new int[] { 2 };
	    Runnable runnable = () -> System.out.println(IntStream
	      .of(1, 2, 3)
	      .map(val -> val + holder[0])
	      .sum());
	 
	    new Thread(runnable).start();
	 
	    // simulating some processing
	    try {
	        Thread.sleep(new Random().nextInt(3) * 1000L);
	    } catch (InterruptedException e) {
	        throw new RuntimeException(e);
	    }
	 
	    holder[0] = 0;
	}

}
