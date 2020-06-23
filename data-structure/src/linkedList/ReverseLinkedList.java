/**
 * 
 */
package linkedList;

/**
 * @author Vipin Patel
 *
 */
public class ReverseLinkedList {
	private Node head;

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

	public static Node reverseLinkedList(Node currentNode) {
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}

		return previousNode;

	}

	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(" " + temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList(head);

		Node reverseHead = reverseLinkedList(head);
		System.out.println("After reversing");
		list.printList(reverseHead);
	}

}
