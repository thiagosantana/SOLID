package com.santana.solid.good;

public class DeliveryCompany {
	private DeliveryService deliveryService;

	public DeliveryCompany(DeliveryService service) {
		this.deliveryService = service;
	}

	public void sendProduct(Product product) {
		this.deliveryService.deliverProduct(product);
	}
}
