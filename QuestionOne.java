package com.cozentus.AbstractQuestions;

abstract class Animal{
	abstract void sound();
}

class Lion extends Animal{
	void sound() {
		System.out.println("Lion Sound");
	}
}

class Tiger extends Animal{
	void sound() {
		System.out.println("Tiger Sound");
	}
}
public class QuestionOne {
	public static void main (String [] args) {
		Lion l = new Lion();
		Tiger t = new Tiger();
		l.sound();
		t.sound();
	}
}
