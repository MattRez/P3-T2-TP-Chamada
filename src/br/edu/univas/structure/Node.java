package br.edu.univas.structure;

import java.util.ArrayList;

import br.edu.univas.vo.Piece;

public class Node {
	
	private Node father;
	private ArrayList<Node> children = new ArrayList<Node>();
	private Piece piece;
	
	public Node() { }
	
	public Node(String name, double value, int quantity) {
		this.piece = new Piece(name, value, quantity);
	}
	
	// get set
	
	public Node getFather() {
		return father;
	}
	public void setFather(Node father) {
		this.father = father;
	}
	public ArrayList<Node> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
}