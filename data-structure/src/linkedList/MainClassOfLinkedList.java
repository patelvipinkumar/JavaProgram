/**
 * 
 */
package linkedList;

import java.util.Scanner;

/**
 * @author Vipin Patel
 *
 */

class Node {
	private int data;
	private Node next;

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}

class LinkedList {
	private Node start;
	private int size;

	public LinkedList() {
		start = null;
		size = 0;
	}

	public void insertAtStart(int val) {
		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		start=n;
		size++;
	}

	public void insertAtLast(int val) {
		Node n, t;
		n = new Node();
		n.setData(val);
		t = start;
		if (t == null) {
			start = n;
		} else {
			while (t.getNext() != null) {
				t = t.getNext();
			}
			t.setNext(n);
		}
		size++;
	}

	public void insertAtPos(int val, int pos) {
		if (pos == 1) {
			insertAtStart(val);
		} else if (pos == size + 1) {
			insertAtLast(val);
		} else if (pos > 1 && pos <= size) {
			Node n, t;
			n = new Node(val, null);
			t = start;

			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;

		} else {
			System.out.println("insertion not Possible at position :" + pos);
		}
	}

	public void deleteAtPos(int pos) {
		if (start == null) {
			System.out.println("List is already empty");
		} else if (pos < 1 || pos > size) {
			System.out.println("invalid position");
		} else if (pos == 1) {
			deleteFirst();
		} else if (pos == size) {
			deleteAtLast();
		} else {
			Node t, t1;
			t = start;
			for (int i = 1; i < pos - 1; i++) {
				t = t.getNext();
			}
			t1 = t.getNext();
			t.setNext(t1.getNext());
			size--;
		}

	}

	public void deleteAtLast() {
		if (start == null) {
			System.out.println("List is already empty");
		} else if (size == 1) {
			start = null;
			size--;
		} else {
			Node t;
			t = start;
			for (int i = 1; i < size - 1; i++) {
				t = t.getNext();
			}
			t.setNext(null);
			size--;
		}
	}

	public void deleteFirst() {
		if (start == null) {
			System.out.println("List is already empty");
		} else {
			start = start.getNext();
			size--;
		}
	}

	public boolean isEmpty() {
		if (start == null) {
			return true;
		} else
			return false;
	}

	public int getListSize() {
		return size;
	}

	public void viewList() {
		Node t;
		if (isEmpty()) {
			System.out.println("list is empty");
		} else {
			t = start;
			for (int i = 1; i <= size; i++) {
				System.out.print(" " + t.getData());
				t = t.getNext();
			}

		}
	}

}

public class MainClassOfLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean flag =true;
		while (flag) {
			System.out.println();
			System.out.println("1. add item to the list at start");
			System.out.println("2. add item to the list at last");
			System.out.println("3. add item to the list at position");
			System.out.println("4. delete item to the list at start");
			System.out.println("5. delete item to the list at last");
			System.out.println("6. delete item to the list at position");
			System.out.println("7. view list");
			System.out.println("8. exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			int position;
			int val;
			switch (choice) {
			case 1:
				System.out.println("enter value of list item");
				val = sc.nextInt();
				list.insertAtStart(val);
				break;
			case 2:
				System.out.println("enter value of list item");
				val = sc.nextInt();
				list.insertAtLast(val);
				break;

			case 3:
				System.out.println("Enter position");
				position = sc.nextInt();
				System.out.println("enter value of list item");
				val = sc.nextInt();
				list.insertAtPos(val, position);
				break;
			case 4:
				list.deleteFirst();
				break;
			case 5:
				list.deleteAtLast();
				break;
			case 6:
				System.out.println("enter position");
				position = sc.nextInt();
				list.deleteAtPos(position);
				break;
			case 7:
				list.viewList();
				break;
			case 8:
				flag=false;
				break;
			default:
				System.out.println("invalid choice");
			}
		}
	}

}
