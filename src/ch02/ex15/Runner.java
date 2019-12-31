package ch02.ex15;

public class Runner {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		invoice.addItem("Mirror", 45.00, 1);
		invoice.addItem("Lightshade", 12.50, 1);
		invoice.addItem("Baubles", 3.00, 4);
		invoice.print();
	}

}
