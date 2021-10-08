//1. Given a Code Complete the Linked List implementation by creating 


//remove, removeFirst, removeLast, addFirst , find functions[new Product().setId(123)] Node= Employee[id, name,salary]

package com.linkedlist;

public class EmployeeLL {
	
	Employee head;
	static int size=0;
	// Traverse and Add
	public static void add(EmployeeLL list, Employee newEmp) {
		if(list.head==null)
			list.head=newEmp;
		else {
			Employee trav = list.head;
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next = newEmp;
		}
	}
	//Print the list
	public static void printList(EmployeeLL list) {
			Employee trav;
			if(list.head==null)
				System.out.println("Empty List");
			else {
				trav = list.head;
				while(trav!=null) {
					System.out.println(trav+"-->");
					trav = trav.next;
				}
			}
	}
	//Add element at First
	public static void addFirst(EmployeeLL list, Employee newEmp) {
		if(list.head==null) 
			list.head=newEmp;
		else {
			newEmp.next = list.head;
			list.head.prev = newEmp;
			list.head = newEmp;
		}
		size++;
	}
	//Remove at First
	public static void removeFirst(EmployeeLL list) {
		if(list.head==null) {
			System.out.println("List is Empty");
		}
		else {
			Employee curr = list.head;
			list.head = curr.next;
			curr.next = null;
		}
	}
	// Remove at Last
	public static void removeLast(EmployeeLL list) {
		if(list.head==null)
			System.out.println("List is Empty");
		else {
			Employee temp = list.head;
			Employee prev = null;
			while(temp.next!=null) {
				prev = temp;
				temp = temp.next;
			}
			prev.next= null;
		}
	}
	// To Remove
	public static void Remove(EmployeeLL list, int id, String name, double salary,Employee newEmp) {
		if(list.head==null)
			System.out.println("List is Empty");
		else {
			Employee curr = list.head;
			Employee curr2 = curr.next;
			while(curr2.next!=null) {
				if(curr2.id==id) {
					Employee temp = curr2;
					curr.next = curr2.next;
					temp=null;
					break;
				}
				curr = curr2;
				curr2 = curr2.next;
			}
			
			}
			
		}
	
	public static void main(String[] args) {
		EmployeeLL list = new EmployeeLL();
		System.out.println("-----------Original List--------------");
		EmployeeLL.add(list, new Employee(12,"Sandy",1111));
		EmployeeLL.add(list, new Employee(13,"Vijji",2222));
		EmployeeLL.add(list, new Employee(14,"Teju",3333));
		EmployeeLL.add(list, new Employee(15,"Lucky",4444));
		printList(list);
		EmployeeLL.removeFirst(list);
		System.out.println("-----------Remove First--------------");
		printList(list);
		EmployeeLL.addFirst(list, new Employee(11,"Manju",1000));
		System.out.println("-----------Add First--------------");
		printList(list);
		EmployeeLL.removeLast(list);
		System.out.println("-----------Remove Last--------------");
		printList(list);
		EmployeeLL.Remove(list, size, null, size, new Employee(14,"Teju",3333));
		System.out.println("-----------Remove--------------");
		printList(list);
	}

}
