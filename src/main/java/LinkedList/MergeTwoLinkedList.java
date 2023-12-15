package LinkedList;

import org.junit.Test;



public class MergeTwoLinkedList {
	
	@Test
	public void testMergeTwoList() {
		Node head1=addNode(1);
		head1.next=addNode(3);
		head1.next.next=addNode(5);
		head1.next.next.next=addNode(7);
		//printAllNode(head1);
		Node head2=addNode(2);
		head2.next=addNode(4);
		head2.next.next=addNode(6);
		head2.next.next.next=addNode(8);
		//printAllNode(head2);
		Node mergeTwoList=mergeTwoList(head1,head2);
		printAllNode(mergeTwoList);
		
	}
	
	public Node mergeTwoList(Node head1, Node head2) {
		Node empty = new Node(0);
		Node newNode = empty;

		Node currentNode1 = head1;
		Node currentNode2 = head2;

	    while (currentNode1 != null && currentNode2 != null) {
	        if (currentNode1.data <= currentNode2.data) {
	        	newNode.next = currentNode1;
	            currentNode1 = currentNode1.next;
	        } else {
	        	newNode.next = currentNode2;
	            currentNode2 = currentNode2.next;
	        }
	        newNode = newNode.next;
	    }

	    // Attach the remaining nodes from either list
	    if (currentNode1 != null) {
	    	newNode.next = currentNode1;
	    } else {
	    	newNode.next = currentNode2;
	    }

	    return empty.next;
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
