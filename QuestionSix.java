package com.cozentus.AbstractQuestions;

abstract class Shape3D{
	
	public abstract double calculateVolume();
	public abstract double calculateSurfaceArea();
	public abstract void display();
}

class Sphere extends Shape3D{
	
	private int radius;
	Sphere(int radius){
		this.radius=radius;
	}
	
	public double calculateVolume() {
		return (4*3.14*radius*radius*radius)/3;
	}
	public double calculateSurfaceArea() {
		return 4*3.14*radius*radius;
	}
	public void display() {
		System.out.println("Volume of Sphere : "+calculateVolume());
		System.out.println("Surface Area of Sphere : "+calculateSurfaceArea());
	}
}

class Cube extends Shape3D{
	
	private int length;
	Cube(int length){
		this.length=length;
	}
	
	public double calculateVolume() {
		return length*length*length;
	}
	public double calculateSurfaceArea() {
		return 6*length*length;
	}
	public void display() {
		System.out.println("Volume of Cube : "+calculateVolume());
		System.out.println("Surface Area of Cube : "+calculateSurfaceArea());
	}
}

public class QuestionSix {
	public static void main(String [] args) {
		
		Shape3D s = new Sphere(2);
		Shape3D c = new Cube(4);
		s.display();
		System.out.println();
		c.display();
	}
}
