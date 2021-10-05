package com.assignment0410;

import java.util.Objects;

public class Student {
	private int rollno;
	private String name;
	private String stream;
	Student next;
	Student prev;
	public Student(int rollno, String name, String stream) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.stream = stream;
		next = null;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStream() {
		return stream;
	}
	
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "[" + rollno + ", " + name + "," + stream + "]";
	
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime+rollno+name.hashCode()+stream.hashCode();
		return Objects.hash(name, next, prev, rollno, stream);
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(next, other.next) && Objects.equals(prev, other.prev)
				&& rollno == other.rollno && Objects.equals(stream, other.stream);
	}
	
	
}