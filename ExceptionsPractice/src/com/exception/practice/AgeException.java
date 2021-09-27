package com.exception.practice;

public class AgeException {
	int age;
	String name;
	public AgeException(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "\n Your age is not eligible for bank account : "+age;
		
	}
}
