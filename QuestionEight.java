package com.cozentus.AbstractQuestions;

abstract class Person {
	
	  public abstract void eat();
	  public abstract void exercise();
	}

class Athlete extends Person {
	
	  public void eat() {
	    System.out.println("Athlete eat");
	  }
	  public void exercise() {
	    System.out.println("Athlete exercise");
	  }
	}

class LazyPerson extends Person {

	  public void eat() {
	    System.out.println("Lazy eat");
	  }
	  public void exercise() {
	    System.out.println("Lazy exercise");
	  }
}
public class QuestionEight {
	public static void main(String[] args) {
	    Person a = new Athlete();
	    Person l = new LazyPerson();
	    a.eat();
	    a.exercise();
	    System.out.println();
	    l.eat();
	    l.exercise();
	  }
}
