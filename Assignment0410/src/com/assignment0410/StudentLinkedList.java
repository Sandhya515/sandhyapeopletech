//Create a LinkedList by adding methods as 
//1.get(int index)
//2.getFirst
//3.getLast
//4.lastIndexOf(Student s)
//5.contains(Student s)--> boolean
package com.assignment0410;

public class StudentLinkedList {
	Student head;
	public void Add(StudentLinkedList list, Student newStudent) {
		if(head==null)
			head = newStudent;
		else {
			Student curr = list.head;
			while(curr.next!=null) {
				curr = curr.next;
			}
			curr.next = newStudent;
		}
	}
	public void printList(StudentLinkedList list) {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Student temp = head;
			while(temp!=null) {
				System.out.print(temp+"-->");
				temp = temp.next;
			}
			System.out.println("\n");
		}
	}
	public void get(StudentLinkedList list, int idx) {
		int i =1;
		if(head==null) {
			System.out.println("Empty List");
		}
		else {
			Student temp = head;
			while(temp!=null) {
				if(i==idx) {
					System.out.println(temp);
				}
				temp = temp.next;
				i++;
			}
		}
	}
	public void getFirst(StudentLinkedList list) {
		if(head==null) {
			System.out.println("Empty list");
		}
		else {
			Student temp = head;
			System.out.println(temp);
		}
	}
	public void getLast(StudentLinkedList list) {
		if(head==null) {
			System.out.println("Empty List");
		}
		else {
			Student temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			System.out.println(temp);
		}
	}
	public void LastIndexOf(StudentLinkedList list) {
		int i =1;
		if(head==null) {
			System.out.println("Empty List");
		}
		else {
			Student temp = head;
			while(temp.next!=null) {
				temp = temp.next;
				i++;
			}
			System.out.println("Last index is:"+i);
		}
	}
	public boolean Contains(StudentLinkedList list,Student s) {
		if(head==null) {
			return false;
		}
		else {
			Student temp = head;
			while(temp.next!=null) {
				if(temp.equals(s)) {
					return true;
				}
				temp = temp.next;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		StudentLinkedList list = new StudentLinkedList();
		list.Add(list, new Student(10,"Teju","CSE"));
		list.Add(list, new Student(11,"Vijaya","ECE"));
		list.Add(list, new Student(12,"Siri","MECH"));
		list.Add(list, new Student(13,"Salma","CE"));
		list.printList(list);
		System.out.println("Using get method");
		list.get(list,2);
		System.out.println("=======================================================");
		System.out.println("Using getFirst method");
		list.getFirst(list);
		System.out.println("=======================================================");
		System.out.println("Using getLast method");
		list.getLast(list);
		System.out.println("=======================================================");
		System.out.println("Using LastIndexOf method");
		list.LastIndexOf(list);
		System.out.println("=======================================================");
		System.out.println("Using Contains method");
		System.out.println(list.Contains(list,new Student(10,"Teju","CSE")));
		
	}
}
