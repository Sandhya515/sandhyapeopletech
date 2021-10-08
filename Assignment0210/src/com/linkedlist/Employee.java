package com.linkedlist;

public class Employee {
	Employee next;
	Employee prev;
	Employee curr;
	int id;
	private String name;
	private int salary;
	public Employee() {
		
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "[" + id + "," + name + ", " + salary + "]";
	}
	
	
}
