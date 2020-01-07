package ch04.ex06;

import java.util.Objects;

public class Item {
	private String description;
	private double price;
	
	public Item(String description, double price) {
		this.description = description;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public boolean equals(Object otherObj) {
		if (this == otherObj) return true;
		if (otherObj == null) return false;
		if (!(otherObj instanceof Item)) return false;
		
		Item other = (Item) otherObj;
		return Objects.equals(description, other.description)
			&& price == other.price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(description, price);
	}
}
