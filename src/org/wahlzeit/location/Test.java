package org.wahlzeit.location;

public class Test {

	private int c = 0; 
	
	public synchronized void increment (){
		c++;
	}
	
	public synchronized void decrement (){
		c--;
	}
	
	public synchronized int value(){
		return c; 
	}
	
	public static void main(final String[] args){
		Test test = new Test(); 
		
		test.increment();
		
		System.out.println(test.value());
		
		test.decrement();
		
		System.out.println(test.value());
	}
}
