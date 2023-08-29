package com.cozentus.AbstractQuestions;

abstract class Vehicle {
	
	  public abstract void startEngine();
	  public abstract void stopEngine();
	}

class Car extends Vehicle {
		
	  public void startEngine() {
	    System.out.println("Car Start");
	  }

	  public void stopEngine() {
	    System.out.println("Car Stop");
	  }
}

class Motorcycle extends Vehicle {

	  public void startEngine() {
	    System.out.println("Motorcycle Start");
	  }

	  public void stopEngine() {
	    System.out.println("Motorcycle Stop");
	  }
}
public class QuestionSeven {
	public static void main(String[] args) {
	    Vehicle c = new Car();
	    Vehicle m = new Motorcycle();

	    c.startEngine();
	    c.stopEngine();
	    System.out.println();
	    m.startEngine();
	    m.stopEngine();
	  }
}
