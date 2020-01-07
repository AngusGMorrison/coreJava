package ch04.ex06;

public class Runner {

	public static void main(String[] args) {
		Item item1 = new DiscountedItem("Item", 10.00, 10);
		Item item2 = new Item("Item", 10.00);
		DiscountedItem item3 = new DiscountedItem("Item", 10.00, 20);
		
		System.out.println(item1.equals(item2));
		System.out.println(item2.equals(item3));
		System.out.println(item1.equals(item3));

	}

}
