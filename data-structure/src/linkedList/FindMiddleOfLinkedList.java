/**
 * 
 */
package linkedList;

/**
 * @author Vipin Patel
 *
 */
public class FindMiddleOfLinkedList {
	Node head;
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
	public void addToTheLast(Node node) {
		 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(" " + temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public  void printMiddle(Node head) {
		Node slow_ptr=head;
		Node fast_ptr=head;
		
		if(head !=null) {
			while(fast_ptr!=null && fast_ptr.next !=null) {
				fast_ptr=fast_ptr.next.next;
				slow_ptr=slow_ptr.next;
			}
			System.out.println("the middle element "+slow_ptr.value);
		}
		
	}
	
	
	public static void main(String[] args) {
		FindMiddleOfLinkedList list=new FindMiddleOfLinkedList();
		Node head=new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.printList();
		list.printMiddle(head);
	}

}
