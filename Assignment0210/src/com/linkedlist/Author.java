package com.linkedlist;

import java.util.Objects;

public class Author {
	Author next;
	Author prev;
	int id;
	private String name;
	private int noOfBooks;
	public Author(int id, String name, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.noOfBooks = noOfBooks;
		this.next=null;
		this.prev=null;
	}
	public Author() {
		
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
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	@Override
	public String toString() {
		return "[" + id + ", " + name + ", " + noOfBooks + "]";
	}
	


}
