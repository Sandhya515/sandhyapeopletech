package com.linkedlist;

public class AuthorLL {
	Author head;
	Author last;
	//1.Add
	public void add(AuthorLL list,Author newBook) {
		if(head==null) {
			head=newBook;
		}
		else {
			last.next=newBook;
			newBook.prev=last;
		}
		last = newBook;
	}
	//2.Print list
	public void printList(AuthorLL list) {
		if(head==null) {
			System.out.println("List is empty");
		}
		Author curr = head;
		while(curr!=null) {
			System.out.print(curr+"<->");
			curr = curr.next;
		}
		System.out.println("\n");
	}
	//3.Remove
	public void remove(AuthorLL list,Author a) {
		if(list.head==null)
			System.out.println("Empty List");
		else if(list.head.getId()==a.getId()) {
			Author temp =list.head;
			list.head=list.head.next;
			temp= null;
		}
		else {
			Author curr = list.head;
			Author curr1 = curr.next;
			while(curr.next!=null) {
				if(curr.getId()==a.getId()) {
					curr.next=curr.next;
					curr1=null;
					break;
				}
				curr=curr1;
				curr1=curr1.next;
			}
		}
	 }
	//4.Remove In Middle
	public void removeAtMiddle(int id,Author newBook) {
		 Author temp=head;
		 if(id==1) {
			 head.next.prev=null;
			 head=head.next;
			 temp.next=null;
		 }
		 else {
			 int count =1;
			 Author prev=head;
			 while(count<id-1) {
				 prev=prev.next;
				 count++;
			 }
			 Author curr = prev.next;
			 prev.next=curr.next;
			 curr.prev=prev.next;
		 }
	 }
	//5.Add In Middle
	public void inserAtMiddle(int id,Author newBook) {
		if(id==1) {
			 newBook.next=head;
			 head.prev=newBook;
			 head=newBook;
		 }
		 else {
			 int count=1;
			 Author prev = head;
			 while(count<id-1) {
				 prev=prev.next;
				 count++;
			 }
			 Author curr = prev.next;
			 newBook.next=curr;
			 newBook.prev=prev;
			 prev.next=newBook;
			 curr.prev=newBook;
		 }
	 }
	//5.Find
	public void find(AuthorLL list,int id) {
		if(list.head==null)
			System.out.println("Empty List");
		else if(list.head.getId()==id)
			System.out.println(list.head);
		else
		{
			Author curr = list.head;
			while(curr.next!=null) {
				if(curr.getId()==id) {
					System.out.println(curr);
					return;
				}
				curr=curr.next;
			}
		}
	}
	public static void main(String[] args) {
		AuthorLL list = new AuthorLL();
		System.out.println("The List is:");
		list.add(list, new Author(11,"OS",3));
		list.add(list, new Author(12,"DS",8));
		list.add(list, new Author(13,"CC",6));
		list.add(list, new Author(15,"DB",4));
		list.printList(list);
		//1.ADD
		System.out.println("Add method:");
		list.add(list, new Author(16,"CD",4));
		list.printList(list);
		//2.Remove
		System.out.println("Remove method:");
		Author a = new Author();
		a.setId(11);
		list.remove(list,a);
		list.printList(list);
		//3.Find
		System.out.println("Find method:");
		list.find(list, 13);
		//4.Add at middle
		System.out.println("Add at Middle:");
		list.inserAtMiddle(3, new Author(33,"BI",10));
		list.printList(list);
		//5.Remove at middle
		System.out.println("Remove at Middle");
		list.removeAtMiddle(3, new Author(33,"BI",10));
		list.printList(list);
	}
}
