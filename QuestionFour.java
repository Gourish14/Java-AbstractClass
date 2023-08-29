package com.cozentus.AbstractQuestions;

abstract class Animall{
	abstract void eat();
	abstract void sleep();
}

class Lionn extends Animall{
	void eat() {
		System.out.println("Lion eat");
	}
	void sleep() {
		System.out.println("Lion sleep");
	}
}

class Tigerr extends Animall {
	void eat() {
		System.out.println("Tiger eat");
	}
	void sleep() {
		System.out.println("Tiger sleep");
	}
}

class Deer {
	void eat() {
		System.out.println("Deer eat");
	}
	void sleep() {
		System.out.println("Deer sleep");
	}
}

public class QuestionFour {
	public static void main(String [] args) {
		Lionn l = new Lionn();
		Tigerr t = new Tigerr();
		Deer d = new Deer();
		l.eat();
		l.sleep();
		t.eat();
		t.sleep();
		d.eat();
		d.sleep();
	}
}
