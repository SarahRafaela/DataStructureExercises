package controller;

public class DNode {
	private String element; //Elemento do DNode � uma string
	private DNode previous; //anterior
	private DNode next; //pr�ximo
	//Cria um node com um elemento e duas refer�ncias
	public DNode(String s, DNode p, DNode n) {
	element = s;
	previous = p;
	next = n;
	}
	//Cria um node com um elemento e duas refer�ncias null
	public DNode(String element) {
	this(element, null, null);
	}
	//m�todos getters e setters...
	
	//Retorna o elemento deste node
	public String getElement() {
	return element;
	}
	//Retorna a refer�ncia para o node anterior
	public DNode getPrevious() {
	return previous;
	}
	//Retorna a refer�ncia para o pr�ximo node
	public DNode getNext() {
	return next;
	}
	//Define o elemento deste node
	public void setElement(String newElem) {
	element = newElem;
	}
	//Define a refer�ncia para o node anterior
	public void setPrevious(DNode newPrevious) {
	previous = newPrevious;
	}
	//Define a refer�ncia para o pr�ximo node
	public void setNext(DNode newNext) {
	next = newNext;
	}
	}
