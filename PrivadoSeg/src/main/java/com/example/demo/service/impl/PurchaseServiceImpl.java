package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.entity.purchase;
import com.example.demo.repository.PurchaseRepository;
import com.example.demo.service.PurchaseService;

public class PurchaseServiceImpl implements PurchaseService{

	@Autowired
	@Qualifier("purchaseRepository")
	private PurchaseRepository purchaseRepository;
	
	@Override
	public List<purchase> listAllPurchase() {
		// TODO Auto-generated method stub
		return purchaseRepository.findAll();
	}

	@Override
	public purchase addPurchase(purchase purchase) {
		// TODO Auto-generated method stub
		return purchaseRepository.save(purchase);
	}

	@Override
	public int removePurchase(int id) {
		// TODO Auto-generated method stub
		purchaseRepository.deleteById(id);
		return 0;
	}

	@Override
	public purchase updatePurchase(purchase purchase) {
		// TODO Auto-generated method stub
		return purchaseRepository.save(purchase);
	}

}
