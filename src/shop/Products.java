package shop;

public class Products {
	private String name;
	//Picture;
	private int price;
	private String description;
	
	public Products(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}
	
	public String getDescriptino() {
		return this.description;
	}
	
}
