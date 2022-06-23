package br.edu.univas.vo;

import java.text.NumberFormat;
import java.util.ArrayList;

import br.edu.univas.structure.Node;

public class Piece {
	
	private String name;
	private double value;
	private int quantity;
	private ArrayList<Node> children = new ArrayList<Node>();
	
	//
	
	public Piece() { }
	
	public Piece(String name, double value, int quantity) {
		
	}
	
	public void format() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(value);
		System.out.println(moneyString);
	}
	
	//get set
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ArrayList<Node> getChildren() {
		return children;
	}
	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
}
