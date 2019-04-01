package controller;

public class Node {
	private String element; //Elemento do Node � uma string
	private Node next; //Refer�ncia para um objeto Node
	//Cria um node com um elemento e uma refer�ncia para o pr�ximo node
	public Node(String s, Node n){
	element = s;
	next = n;
	}
	//Cria um node com um elemento e uma refer�ncia null
	public Node(String element) {
	this(element, null);
	}
	//Retorna o elemento deste node
	public String getElement(){ 
		return element; 
		}
	//Retorna a refer�ncia para o pr�ximo node
	public Node getNext(){ 
		return next; 
		}
	//Define o elemento deste node
	public void setElement(String newElem){
		element = newElem;
		}
	//Define a refer�ncia para o pr�ximo node
	public void setNext(Node newNext){ 
		next = newNext; 
		}
}
