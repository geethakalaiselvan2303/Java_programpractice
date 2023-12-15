package LinkedList;

import java.util.Stack;

import org.junit.Test;

public class ReverseList_ExtraSpace {
	
	@Test
	public void testReverseList() {
		Node head=addNode(10);
		head.next=addNode(15);
		head.next.next=addNode(20);
		head.next.next.next=addNode(40);
		head.next.next.next.next=addNode(50);
		printAllNodes(head);
		System.out.println("---------------------");
		printAllNodes(reverseList(head));
	}
		
	public Node reverseList(Node head) {
		   Node newNode = null; 
		   Stack<Integer> stack=new Stack<Integer>();
		   Node currentNode=head;
		   while(currentNode.next!=null) {
		    	int n=currentNode.data;
		    	stack.push(n);
		    	currentNode=currentNode.next;
		   }
		   while(!stack.isEmpty()) {
			   newNode.data = stack.pop();
			   newNode.next=null;
		   }
	 
					return newNode;
	}

	int size=0;
	public class Node{
		int data;
		Node next;
		
		public Node(int key) {
			this.data=key;
		}
	}
	
	public Node addNode(int data) {
		size++;
		Node node=new Node(data);
		return node;
	}
	
	public void printAllNodes(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
	}
}
