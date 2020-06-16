package shop;

import java.util.ArrayList;
import java.util.List;

public class ProductsMenager {
	
	private List<Products> list = new ArrayList<Products>();
	
	public ProductsMenager() {
		super();
	}
	
	public void addProduct(Products productToAdd) {
		list.add(productToAdd);
	}
	

}
