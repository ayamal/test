package com.inti.formation;

public class Calculator {
	
	    
	    public int add(int a, int b) {
	        // TODO Auto-generated method stub
	        return a+b;
	   

	}
	    public int multiple(int a, int b){
			return a*b; 
		}
	    public void longCalculation() {
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    public double add(double a, double b) {
	    	return a + b;
	    }

	    public double multiply(double a, double b) {
	    	return a * b;
	    }
}
