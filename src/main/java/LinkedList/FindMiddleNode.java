package LinkedList;

import org.junit.Test;

import LinkedList.RemoveDuplicates.Node;

public class FindMiddleNode {
	
	
	
	@Test
	public void testFindMiddleNode() {
		Node head=addNode(2);
		head.next=addNode(3);
		head.next=addNode(4);
		head.next.next=addNode(5);
		head.next.next.next=addNode(6);
		head.next.next.next.next=addNode(7);
		head.next.next.next.next.next=addNode(8);
		//printAllNode(head);
		System.out.println(findMiddleNode(head));
	}
 
	public int findMiddleNode(Node head) {
		Node slow=head;
		Node fast=head.next;
		while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }
		return slow.data;
	}

	public class Node{
		int data;
		Node next;
		Node(int key){
			this.data=key;
		}
	}
	
	public Node addNode(int data) {
		Node node=new Node(data);
		return node;		
	}
	
	public void printAllNode(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
}
