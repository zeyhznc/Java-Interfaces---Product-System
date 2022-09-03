package org.javaturk.oofp.ch03HW_Q5;

public abstract class Abstract_Product implements Priceable{
	protected String sku;
	protected String description;
	
	public Abstract_Product(String sku, String description){
		this.sku = sku;
		this.description = description;
	}
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
