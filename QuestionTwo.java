package com.cozentus.AbstractQuestions;

abstract class Shape{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Circle extends Shape{
	void calculateArea() {
		System.out.println("Area of Circle");
	}
	void calculatePerimeter() {
		System.out.println("Perimeter of Circle");
	}
}

class Triangle extends Shape{
	void calculateArea() {
		System.out.println("Area of Triangle");
	}
	void calculatePerimeter() {
		System.out.println("Perimeter of Triangle");
	}
}
public class QuestionTwo {
	public static void main(String [] args) {
		
		Circle c = new Circle();
		Triangle t = new Triangle();
		c.calculateArea();
		c.calculatePerimeter();
		t.calculateArea();
		t.calculatePerimeter();
	}
}
