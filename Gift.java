package org.javaturk.oofp.ch03HW_Q5;

public class Gift extends Abstract_Product implements Locatable {
	public Gift (String sku, String description) {
		super(sku,description);
	}
	
	public void giveGift(ClothProduct c) {
		System.out.println("Your gift is in the following way: " +super.getDescription());
	}
	
	@Override
	public void getDepot() {
		System.out.println("The product having the description: " +super.getDescription()+ "is in the depot");
	}
	
	@Override
	public void getPlace() {
		System.out.println("The product having the description: " +super.getDescription()+ "was placed");
	}

	@Override
	public void purchase() {
		System.out.println("The product having the description: " +super.getDescription()+ "is ready to be purchased.");
	}
}
