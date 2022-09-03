package org.javaturk.oofp.ch03HW_Q5;

public class ConsultancyProduct extends Product implements Priceable {
	
	// public Product(String sku, String description, double price, double tax, Location loc)
	public ConsultancyProduct(String sku, String description, double price, double tax) {
		super(sku,description,price,tax);
	}
	
	public void provideConsultancy() {
		System.out.println("The service required for the description " +super.getDescription()+ "was provided");
	}
	
	@Override
	public void purchase() {
		System.out.println("The cost of consultancy service for the description: " +super.getDescription()+ "is " +super.getPrice() );
	}
}
