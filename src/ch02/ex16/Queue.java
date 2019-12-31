package ch02.ex16;

public class Queue {
	
	private static class Node {
		Node next = null;
		String data;
		
		private Node(String data) {
			this.data = data;
		}
	}
	
	private Node head = null;
	private Node tail = null;
	private int length = 0;
	
	public int length() {
		return length;
	}
	
	public String add(String data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
		length += 1;
		return node.data;
	}
	
	public String remove() {
		if (head == null) return null;
		
		Node nodeToRemove = head;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}
		length -= 1;
		return nodeToRemove.data;
	}
}
