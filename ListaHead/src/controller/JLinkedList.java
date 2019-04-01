package controller;

public class JLinkedList {

	protected Node head;

	public JLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Node getFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();

		}
		return head;
	}

	public Node getLast(Node newNode) throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current;
	}

	public void insertFirst(Node newNode) {
		newNode.setNext(head);
		head = newNode;
	}

	public void insertLast(Node newNode) {
		if (isEmpty()) {

			insertFirst(newNode);

		} else {
			newNode.setNext(null);
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();

			}
			current.setNext(newNode);
		}
	}

	public Node removeFirst() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = head;
		if (head.getNext() == null) {
			head = null;
		} else {
			head = head.getNext();
		}
		return removedItem;
	}

	public Node removeLast() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Node removedItem = null;
		if (head.getNext() == null) {
			removedItem = head = null;
		}
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		removedItem = current;
		Node aux = head;
		while (aux.getNext() != removedItem) {
			aux= aux.getNext();
		}
		aux.setNext(null);
		
		
		return removedItem;
		}

		
	

	public void show() {
		if (isEmpty()) {
			System.out.println("Lista vazia!");
		} else {
			System.out.print("A lista é: ");
			Node current = head;
			while (current != null) {
				System.out.print(current.getElement().toString() + " ");
				current = current.getNext();
			}
			System.out.println("\n");
		}
	}
}
