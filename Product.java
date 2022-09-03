package org.javaturk.oofp.ch03HW_Q5;

public class Product extends Abstract_Product implements Priceable {
// Priceable ve Locatable metotlarını override et
	
	double price;
	double tax;
	
 Product(String sku, String description, double price, double tax){
	 	super(sku,description);
		this.price = price;
		this.tax = tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public void purchase() {
		System.out.println("The product having the description: " +super.getDescription()+ "is sold for the cost of" +this.getPrice());
	}

	@Override
	public String toString() {
		return "Product Information: " + "Product [price=" + price + ", tax=" + tax + ", description=" + description + "]";
	}
}
