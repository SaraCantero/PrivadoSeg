package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.purchase;

public interface PurchaseService {

	public abstract List <purchase> listAllPurchase();
	public abstract purchase addPurchase(purchase purchase);
	public abstract int removePurchase(int id);
	public abstract purchase updatePurchase(purchase purchase);
}
