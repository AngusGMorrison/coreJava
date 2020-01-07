package ch04.ex06;

import java.util.Objects;

public class DiscountedItem extends Item {
	private double discount;
	
	public DiscountedItem(String description, double price, double discount) {
		super(description, price);
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	@Override
	public boolean equals(Object otherObj) {
		if (!super.equals(otherObj)) return false;
		if (getClass() == otherObj.getClass()) {
			DiscountedItem other = (DiscountedItem) otherObj;
			return discount == other.discount;
		} else {
			return true;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), discount);
	}

}
