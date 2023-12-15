package LinkedList;


import org.junit.Test;

import LinkedList.ReverseLinkedList.Node;

public class RemoveDuplicates {
	
	
	@Test
	public void testRemoveDuplicates() {
		Node head=addNode(10);
		head.next=addNode(20);
		head.next.next=addNode(20);
		head.next.next.next=addNode(40);
		head.next.next.next.next=addNode(50);
		head.next.next.next.next.next=addNode(60);
		printAllNodes(head);
		System.out.println("---------------------");
		printAllNodes(removeDuplicates(head));
	}

	public Node removeDuplicates(Node head) {
		Node prev=null;
		Node current=head;
		while(current.next!=null) {
			if(current.data==current.next.data) {
				prev.next=current.next;
			}
			prev=current;
			current=current.next;
			
		}
		return head;
	}

	public class Node{
		int data;
		Node next;
		
		public Node(int key) {
			this.data=key;
		}
	}
	public Node addNode(int data) {
		Node node = new Node(data);
		return node;
	}

	public void printAllNodes(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
	
}
