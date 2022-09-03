package org.javaturk.oofp.ch03HW_Q5;

import java.util.Date;

public class FoodProduct extends Product implements Priceable,Locatable {
	Date productionDate;
	int life;
	
// public Product(String sku, String description, double price, double tax, Location loc)	
	public FoodProduct(String sku, String description, double price, double tax, Date productionDate, int life) {
		super(sku, description, price, tax);
		this.productionDate = productionDate;
		this.life = life;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	
	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}




@Override
public void getDepot() {
	System.out.println("The product which is" + super.getDescription()  + "in the depot");
	
}


@Override
public void getPlace() {
	System.out.println("The product which is" + super.getDescription()  + "get placed");
}


@Override
public void purchase() {
	System.out.println("The product which is" + super.getDescription()  + "is ready to be purchased");
	}

}
