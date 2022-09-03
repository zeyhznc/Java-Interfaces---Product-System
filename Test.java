package org.javaturk.oofp.ch03HW_Q5;

import org.javaturk.oofp.ch03HW_Q5.ClothProduct;
import org.javaturk.oofp.ch03HW_Q5.ConsultancyProduct;
import org.javaturk.oofp.ch03HW_Q5.Gift;
import org.javaturk.oofp.ch03HW_Q5.OldComputers;

public class Test {

	public static void main(String[] args) {
		ClothProduct c = new ClothProduct("A1", "Shirt", 150.00, 40.00, "Woman", "M");
		c.getPlace();
		System.out.println(c.toString());
		c.getDepot();
		c.purchase();
		
		System.out.println();
		
		OldComputers old = new OldComputers("Old Computer", 3000.00, false);
		old.getDepot();
		old.isSold();
		old.getPlace();
		old.isSold = true;
		old.isSold();
		
		Gift g = new Gift("a1", "Sunglasses");
		g.getDepot();
		g.getPlace();
		g.giveGift(null);
		g.giveGift(c);
		
		System.out.println();
		
		ConsultancyProduct cons = new ConsultancyProduct("Sales Consultancy", "c1", 2000, 110);
		cons.purchase();
		cons.provideConsultancy();
		
	}

}
