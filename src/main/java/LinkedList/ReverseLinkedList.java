package LinkedList;

import org.junit.Test;

public class ReverseLinkedList {
 
	public class Node{
		int data;
		Node next;
		Node prev;
		
		@Test
		public void testReverse() {
			Node head=addNode(10);
			head.next=addNode(20);
			head.next.next=addNode(30);
			head.next.next.next=addNode(40);
			head.next.next.next.next=addNode(50);
			printAllNodes(head);
			System.out.println(reverseLinkedList(head));
		}
		
		public Node reverseLinkedList(Node node) {
			Node head = node, prev = null, next = null;

			while(head != null) {
				// next
				next = head.next;
				// prev
				head.next = prev;

				// swap
				prev = head;
				head = next;
			}

			return prev;
			
		}

		private void printAllNodes(Node node) {
			
			while(node!=null) {
				System.out.println(node.data);
				node=node.next;
			}
		}

		Node(int key){
			this.data=key;
			next=null;
		}
		
		public Node addNode(int data) {
			Node node=new Node(data);
			return node;
		}
	}
}
