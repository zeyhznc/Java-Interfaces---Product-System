package org.javaturk.oofp.ch03HW_Q5;

public class OldComputers implements Locatable, Priceable{
	String description;
	double price;
	boolean isSold = false;
	
	public OldComputers(String description,double price, boolean isSold) {
		this.description = description;
		this.price = price;
		this.isSold = isSold;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public void purchase() {
		System.out.println("The product having the description: " +getDescription()+ "is sold");
	}
	
	@Override
	public void getDepot() {
		System.out.println("The product having the description: " +getDescription()+ "is in the depot.");
	}
	
	@Override
	public void getPlace() {
		System.out.println("The product having the description: " +getDescription()+ "was placed");
	}
	
	public boolean isSold() {
		if (!isSold) {
			isSold = true;
			System.out.println("The old computer having the description: " +getDescription()+ "can be sold.");
		}
		else {
			System.out.println("The old computer having the description: " +getDescription()+ "can not be sold");
		}
		return isSold;
	}
	
	
	
	

}
