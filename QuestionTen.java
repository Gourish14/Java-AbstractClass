package com.cozentus.AbstractQuestions;

abstract class Shape2D {
	
	  public abstract void draw();
	  public abstract void resize();
}

class Rectangle extends Shape2D {

	  public void draw() {
	    System.out.println("Rectangle draw");
	  }
	  public void resize() {
	    System.out.println("Rectangle resize");
	  }
}

class Circlee extends Shape2D {

	  public void draw() {
	    System.out.println("Circle draw");
	  }

	  public void resize() {
	    System.out.println("Circle resize");
	  }
}

public class QuestionTen {
	  public static void main(String[] args) {
	    Shape2D r = new Rectangle();
	    Shape2D c = new Circlee();

	    r.draw();
	    r.resize();
	    System.out.println();
	    c.draw();
	    c.resize();
	  }
}
