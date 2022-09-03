package org.javaturk.oofp.ch03HW_Q5;

public class ClothProduct extends Product implements Priceable, Locatable {
	
	String sex;
	String size;
	
// public Product(String sku, String description, double price, double tax, Location loc)	
	public ClothProduct(String sku, String description, double price, double tax, String sex,String size) {
		super(sku, description,price,tax);
		this.sex = sex;
		this.size = size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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
