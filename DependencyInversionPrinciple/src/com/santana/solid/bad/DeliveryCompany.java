package com.santana.solid.bad;

public class DeliveryCompany {
	public void sendProduct(Product product) {
		DeliveryDriver deliveryDriver = new DeliveryDriver();
		deliveryDriver.deliverProduct(product);
	}
}
