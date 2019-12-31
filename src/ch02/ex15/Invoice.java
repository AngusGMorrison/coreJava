package ch02.ex15;

import java.util.ArrayList;

public class Invoice {
	
	private static class Item {
		String description;
		double price;
		int quantity;
		
		private Item(String description, double price, int quantity) {
			this.description = description;
			this.price = price;
			this.quantity = quantity;
		}
		
		public double total() {
			return price * quantity;
		}
	}
	
	ArrayList<Item> items = new ArrayList<>();
	
	public void addItem(String description, double price, int quantity) {
		Item item = new Item(description, price, quantity);
		items.add(item);
	}
	
	public void print() {
		String spacing = "\t\t\t\t\t";
		for (Item item : items) {
			System.out.println(item.description + spacing + item.price + spacing + item.quantity + spacing + item.total());
		}
	}
}
